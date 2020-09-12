package com.mapbar.misc;

import com.mapbar.ParamException;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合类
 */
public class Combine {

    public Combine() {
    }
    /**
     * 组合函数
     * @param n
     * @param k
     * @return
     */
    public List<List<Integer>> combine(int n, int k) throws ParamException {
        if(n < k) {
            throw new ParamException("组合n必须大于等于k");
        }
        if(n <= 0 || k < 0) {
            throw new ParamException("n大于0，k大于等于0");
        }
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(n, k, 1, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int n, int k, int start, List<Integer> temp, List<List<Integer>> ans) {
        if(k == temp.size()) {
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i = start; i < n + 1; i++) {
            temp.add(i);
            backtrack(n, k, i + 1, temp, ans);
            temp.remove(temp.size() - 1);
        }
    }
}
