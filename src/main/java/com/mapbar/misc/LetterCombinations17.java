package com.mapbar.misc;

import java.util.*;

public class LetterCombinations17 {


    private static Map<Character, List<Character>> phone = new HashMap<>();

    static {
        phone.put('2', Arrays.asList('a', 'b', 'c'));
        phone.put('3', Arrays.asList('d', 'e', 'f'));
        phone.put('4', Arrays.asList('g', 'h', 'i'));
        phone.put('5', Arrays.asList('j', 'k', 'l'));
        phone.put('6', Arrays.asList('m', 'n', 'o'));
        phone.put('7', Arrays.asList('p', 'q', 'r', 's'));
        phone.put('8', Arrays.asList('t', 'u', 'v'));
        phone.put('9', Arrays.asList('w', 'x', 'y', 'z'));
    }

    private List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        if(n == 0) {
            return ans;
        }
        dfs(n, digits, new ArrayList<>(), 0);
        return ans;
    }

    private void dfs(int n, String digits, List<Character> temp, int start) {
        if(start >= n) {
            if(temp.size() == n) {
                StringBuilder sb = new StringBuilder();
                for(Character t : temp) {
                    sb.append(t);
                }
                ans.add(sb.toString());
            }
            return ;
        }
        for(int i = start; i < n; i++) {
            List<Character> chars = phone.get(digits.charAt(i));
            for(char ch : chars) {
                temp.add(ch);
                dfs(n, digits, temp, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
