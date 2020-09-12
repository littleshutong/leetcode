package com.mapbar.misc;

import com.mapbar.util.PrintUtil;

import java.util.*;

public class FindSubsequences491 {

    public static void main(String[] args) {
        FindSubsequences491 findSubsequences491 = new FindSubsequences491();
    }

    private List<List<Integer>> ans = new ArrayList<List<Integer>>();
    private List<Integer> temp = new ArrayList<>();
    // 方法2使用到的成员变量
    private Set<Integer> set = new HashSet<Integer>();
    private int n;

    /**
     * 方法2， 二进制加去重。由二进制数字正好是一个序列的排列。例如：3个位置的组合为8种，正好对应2的3次方8个数字。
     */
    public List<List<Integer>> findSubsequences2(int[] nums) {
        n = nums.length;
        for (int i = 0; i < (1 << n); ++i) {
            findSubsequences(i, nums);
            int hashValue = getHash(263, (int) 1E9 + 7);
            if (check() && !set.contains(hashValue)) {
                ans.add(new ArrayList<Integer>(temp));
                set.add(hashValue);
            }
        }
        return ans;
    }

    /**
     * 通过mask找到序列，比如mask为3对应二进制为0...011
     * @param mask
     * @param nums
     */
    public void findSubsequences(int mask, int[] nums) {
        // 清除temp
        temp.clear();
        for (int i = 0; i < n; ++i) {
            // 位运算，每次得到相应位置元素。
            if ((mask & 1) != 0) {
                temp.add(nums[i]);
            }
            // 整个序列像右移动一格
            mask >>= 1;
        }
    }

    /**
     *  Rabin-Karp 串哈希算法
     * @param base
     * @param mod
     * @return
     */
    public int getHash(int base, int mod) {
        int hashValue = 0;
        for (int x : temp) {
            hashValue = hashValue * base % mod + (x + 101);
            hashValue %= mod;
        }
        return hashValue;
    }

    public boolean check() {
        for (int i = 1; i < temp.size(); ++i) {
            if (temp.get(i) < temp.get(i - 1)) {
                return false;
            }
        }
        return temp.size() >= 2;
    }


    /**
     * 采用回溯算法枚举二进制的所有可能值
     */
    public void enumBinary(int start, int n) {
        if(start >= n) {
            ans.add(new ArrayList<>(temp));
            return ;
        }
        temp.add(1);
        enumBinary(start + 1, n);
        temp.remove(temp.size() - 1);
        temp.add(0);
        enumBinary(start + 1, n);
        temp.remove(temp.size() - 1);
    }

    /**
     * 递归加回溯的思想，本题总结在ans和temp放在类的属性中。直的借鉴。
     * @param nums
     * @return
     */
    public List<List<Integer>> findSubsequences(int[] nums) {
        int n = nums.length;
        if(n <= 1) {
            return ans;
        }
        dfs( 0, Integer.MIN_VALUE, nums);
        return ans;
    }

    public void dfs(int start, int preValue, int[] nums) {
        // 递归终止条件，如果当前star大于数组长度。将temp数组满足条件结果加入ans中，并返回。
        if(start >= nums.length) {
            if(temp.size() > 1) {
                ans.add(new ArrayList<>(temp));
            }
            return ;
        }
        // 如果当前数值大于之前数据，进行加入。并递归。
        if(nums[start] >= preValue) {   // 将当前元素加入，并向后遍历
            temp.add(nums[start]);
            // 一条道走到黑，如果一直满足条件就一直进行递归。
            dfs(start + 1, nums[start], nums);
            // 回溯思想，加入之后要进行移除操作。
            temp.remove(temp.size() - 1);
        }
        if(nums[start] != preValue) {   // 不遍历 重复元素
            dfs(start + 1, preValue, nums);  // 将下一个元素加入，并向后遍历
        }
    }

}
