package com.mapbar.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDup90 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        if(n == 0) {
            return ans;
        }
        Arrays.sort(nums);
        dfs(nums, ans, 0, new ArrayList<>());
        return ans;
    }

    private void dfs(int[] nums, List<List<Integer>> ans, int start, List<Integer> temp) {
        if(start == nums.length) {
            return ;
        }
        for(int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            temp.add(nums[i]);
            ans.add(new ArrayList<>(temp));
            dfs(nums, ans, i + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
