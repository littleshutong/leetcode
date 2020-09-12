package com.mapbar.misc;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯算法进行全排列
 */
public class Permute46 {

    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        if(n == 0) {
            return ans;
        }
        boolean[] used = new boolean[n];
        backtrack(nums, new ArrayList<>(), n, used);
        return ans;
    }

    public void backtrack(int[] nums, List<Integer> temp, int n, boolean[] used) {
        if(temp.size() == n) {
            ans.add(new ArrayList<>(temp));
        }
        for(int i = 0; i < n; i++) {
            if(used[i]) {
                continue;
            }
            used[i] = true;
            temp.add(nums[i]);
            backtrack(nums, temp, n, used);
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
}
