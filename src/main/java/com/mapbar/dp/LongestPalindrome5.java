package com.mapbar.dp;

public class LongestPalindrome5 {

    public String longestPalindrome(String s) {
        int n = s.length();
        if(n == 0) {
            return "";
        }
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++) {
            dp[i][i] = 1;
            if(i > 0) {
                dp[i][i - 1] = 2;
            }
        }
        int max = 0, start = 0, end =0;
        for(int i = n - 1; i > -1; i--) {
            for(int j = i + 1; j < n; j++) {
                if(s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] > 0) {
                    dp[i][j] = Math.max(dp[i + 1][j - 1] + 2, dp[i][j - 1]);
                    dp[i][j] = Math.max(dp[i][j], dp[i + 1][j]);
                    if(max < dp[i][j]) {
                        max = j - i;
                        start = i;
                        end = j;
                    }
                }
            }
        }
        return s.substring(start, end + 1);
    }
}
