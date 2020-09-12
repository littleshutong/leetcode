package com.mapbar.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum40 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = candidates.length;
        if(n == 0) {
            return ans;
        }
        // 排序
        Arrays.sort(candidates);
        // 递归加回溯
        dfs(candidates, target, 0, new ArrayList<Integer>(), ans);
        return ans;
    }

    /**
     *
     * @param candidates 候选集合
     * @param target 目标值
     * @param start 开始元素
     * @param temp 临时数组
     * @param ans 答案集合
     */
    private void dfs(int[] candidates, int target, int start, ArrayList<Integer> temp, List<List<Integer>> ans) {
        if(target == 0) {
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i = start; i < candidates.length; i++) {
            // 剪枝，回溯树的同一行相邻重复元素不进行选择，因为首次出现的元素已经进行了递归处理
            if(i > start && candidates[i - 1] == candidates[i]) {
                continue;
            }
            int diff = target - candidates[i];
            if(diff >= 0) {
                temp.add(candidates[i]);
                dfs(candidates, diff, i + 1, temp, ans);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
