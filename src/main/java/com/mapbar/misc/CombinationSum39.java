package com.mapbar.misc;

import java.util.ArrayList;
import java.util.List;

/**
 * 回溯方法
 */
public class CombinationSum39 {

    private List<List<Integer>> ans = new ArrayList<>();


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, target, new ArrayList<>(), candidates.length, 0, 0);
        return ans;
    }

    private void backtrack(int[] candidates, int target, ArrayList<Integer> temp, int length, int sum, int start) {
        if(sum > target) {
            return ;
        }
        if(sum == target) {
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i = start; i < candidates.length; i++) {
            temp.add(candidates[i]);
            sum += candidates[i];
            backtrack(candidates, target, temp, length, sum, i);
            sum -= candidates[i];
            temp.remove(temp.size() - 1);
        }
    }


}
