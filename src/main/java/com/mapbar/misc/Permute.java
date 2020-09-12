package com.mapbar.misc;

import java.util.ArrayList;
import java.util.List;

/**
 * 排列
 */
public class Permute {

    /**
     * 排列数
     * @param a
     * @return
     */
    public List<List<Integer>> permute(int a) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(a, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int a, List<Integer> temp, List<List<Integer>> ans) {
        if(a == temp.size()) {
            ans.add(new ArrayList<>(temp));
        }
        for(int i = 1; i <= a; i++) {
            if(temp.contains(i)) {
                continue;
            }
            temp.add(i);
            backtrack(a, temp, ans);
            temp.remove(temp.size() - 1);
        }
    }
}
