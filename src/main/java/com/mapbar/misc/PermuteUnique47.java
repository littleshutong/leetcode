package com.mapbar.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermuteUnique47 {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length == 0) {
            return ans;
        }
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        dfs(nums, new ArrayList<Integer>(), ans, list);
        return ans;
    }

    private void dfs(int[] nums, ArrayList<Integer> temp, List<List<Integer>> ans, ArrayList<Integer> list) {
        if(temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i = 0; i < list.size(); i++) {
            if(i > 0 && list.get(i) == list.get(i - 1)) {
                continue;
            }
            temp.add(list.get(i));
            ArrayList<Integer> p = new ArrayList<>();
            for(int j = 0; j < list.size(); j++) {
                if(i == j) {
                    continue;
                }
                p.add(list.get(j));
            }
            dfs(nums, temp, ans, p);
            temp.remove(temp.size() - 1);
        }
    }
}
