package com.mapbar.misc;

import java.util.ArrayList;
import java.util.List;

public class Subsets78 {

    /**
     * 通过位运算生成子集
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        int n = nums.length;
        for (int i = (int)Math.pow(2, n); i < (int)Math.pow(2, n + 1); ++i) {
            // generate bitmask, from 0..00 to 1..11
            String bitmask = Integer.toBinaryString(i).substring(1);
            // append subset corresponding to that bitmask
            List<Integer> curr = new ArrayList();
            for (int j = 0; j < n; ++j) {
                if (bitmask.charAt(j) == '1') curr.add(nums[j]);
            }
            output.add(curr);
        }
        return output;
    }

    /**
     * 简单的子集添加
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for(int i = 0; i < nums.length; i++) {
            List<List<Integer>> list = new ArrayList<>();
            for(List<Integer> temp : ans) {
                List<Integer> t = new ArrayList<>(temp);
                t.add(nums[i]);
                list.add(t);
            }
            ans.addAll(list);
        }
        return ans;
    }

}
