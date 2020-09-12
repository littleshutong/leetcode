package com.mapbar.dp;

public class NumDecodings91 {

    public int numDecodings(String s) {
        int n = s.length();
        if(n == 0) {
            return 0;
        }
        if(s.charAt(0) == '0') {
            return 0;
        }
        int a = 1, b = 1, c = 1;
        for(int i = 1; i < n; i++) {
            int p = s.charAt(i - 1) - '0';
            int q = s.charAt(i) - '0';
            if(i + 1 < n && s.charAt(i + 1) == '0') {
                continue;
            }
            if(q == 0 && (p > 2 || p == 0)) {
                return 0;
            }
            c = p * 10 + q < 27 && q != 0 && p != 0 ? a + b : b;
            a = b;
            b = c;
        }
        return c;
    }
}
