package com.mapbar.misc;

import java.util.ArrayList;
import java.util.List;

public class GetPermutation60 {


    public String getPermutation2(int n, int k) {
        int[] permutationNum = new int[n + 1];
        permutationNum[0] = 1;
        StringBuilder sortChars = new StringBuilder();
        for(int i = 1; i < n + 1; i++) {
            permutationNum[i] = permutationNum[i - 1] * i;
            sortChars.append(i);
        }
        StringBuilder ans = new StringBuilder();
        int index = k - 1;
        for(int i = n - 1; i >= 1; i--) {
            int select = index / permutationNum[i];
            ans.append(sortChars.charAt(select));
            index %= permutationNum[i];
            sortChars.deleteCharAt(select);
        }
        ans.append(sortChars.charAt(0));

        return ans.toString();
    }

    public String getPermutation(int n, int k) {
        List<String> temp = new ArrayList<String>();
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            temp.add(i + 1 + "");
        }
        int[] m = new int[n + 1];
        m[0] = 1; m[1] = 1;
        for(int i = 2; i <= n; i++) {
            m[i] = m[i - 1] * i ;
        }
        while(n != 0) {
            int x = k / m[n - 1];
            int y = k % m[n - 1];
            if(y == 0) {
                String t = temp.get(x - 1);
                ans.add(t);
                temp.remove(t);
                for(int i = temp.size() -1 ; i > -1; i--) {
                    ans.add(temp.get(i));
                }
                temp.clear();
                break;
            } else {
                String t = temp.get(x);
                ans.add(t);
                k = y;
                temp.remove(t);
            }
            n--;
        }
        if(temp.size() > 0) {
            for(int i = 0; i < temp.size(); i++) {
                ans.add(temp.get(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String s : ans) {
            sb.append(s);
        }
        return sb.toString();
    }
}
