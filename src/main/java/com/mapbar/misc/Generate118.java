package com.mapbar.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generate118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows == 0) {
            return ans;
        }
        ans.add(Arrays.asList(new Integer[]{1}));
        for(int i = 1; i < numRows; i++) {
            List<Integer> last = ans.get(i - 1);
            List<Integer> curr = new ArrayList<>();
            curr.add(last.get(0));
            for(int j = 1; j < last.size(); j++) {
                curr.add(last.get(j) + last.get(j - 1));
            }
            curr.add(last.get(last.size() - 1));
            ans.add(curr);
        }
        return ans;
    }
}
