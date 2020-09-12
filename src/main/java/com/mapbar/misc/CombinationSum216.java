package com.mapbar.misc;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum216 {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(n, k, 1, new ArrayList<>(), 0, ans);
        return ans;
    }

    private void dfs(int n, int k, int start, List<Integer> temp, int sum, List<List<Integer>> ans) {
        if(temp.size() > k || sum > n) {
            return ;
        }
        if(sum == n && temp.size() == k) {
            ans.add(new ArrayList<>(temp));
        }
        for(int i = start; i <= n && i < 10; i++) {
            temp.add(i);
            dfs(n, k, i + 1, temp, sum + i, ans);
            temp.remove(temp.size() - 1);
        }
    }

    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> temp = new ArrayList<>();

    /**
     * 官方解答，利用二进制进行枚举
     * @param k
     * @param n
     * @return
     */
    public List<List<Integer>> combinationSum32(int k, int n) {
        // 1 << 9 位运算9个位置，满足所有的1到9的所有组合情况。接下来遍历所有可能。如果满足条件加入到集合中。
        for (int mask = 0; mask < (1 << 9); ++mask) {
            if (check(mask, k, n)) {
                ans.add(new ArrayList<Integer>(temp));
            }
        }
        return ans;
    }

    /**
     * 检查是否满足k个数和为n
     * @param mask
     * @param k
     * @param n
     * @return
     */
    public boolean check(int mask, int k, int n) {
        temp.clear();
        // 查看二进制位是否为1，如果为1加入到temp中。
        for (int i = 0; i < 9; ++i) {
            if (((1 << i) & mask) != 0) {
                temp.add(i + 1);
            }
        }
        // 大于k个元素
        if (temp.size() != k) {
            return false;
        }
        int sum = 0;
        for (int num : temp) {
            sum += num;
        }
        return sum == n;
    }

}
