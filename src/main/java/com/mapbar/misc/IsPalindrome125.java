package com.mapbar.misc;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome125 {

    public boolean isPalindrome(String s) {
        int n = s.length();
        if(n == 0) {
            return false;
        }
        char[] chs = s.toLowerCase().toCharArray();
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            char ch = chs[i];
            if(ch >= '0' && ch <= '9') {
                list.add(ch);
            }
            if(ch >= 'a' && ch <= 'z') {
                list.add(ch);
            }
        }
        for(int i = 0; i < list.size() / 2; i++) {
            char start = list.get(i);
            char end = list.get(list.size() - i - 1);
            if(start != end) {
                return false;
            }
        }
        return true;
    }
}
