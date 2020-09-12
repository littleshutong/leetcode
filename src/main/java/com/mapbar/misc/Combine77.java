package com.mapbar.misc;

import java.util.ArrayList;
import java.util.List;

public class Combine77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(k, n, new ArrayList<>(), ans, 1);
        return ans;
    }

    private void backtrack(int k, int n, List<Integer> temp, List<List<Integer>> ans, int start) {
        if(k == temp.size()) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start; i <= n; i++) {
            temp.add(i);
            backtrack(k, n, temp, ans, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
