package com.mapbar.dp;

public class IsInterleave97 {

    public boolean isInterleave(String s1, String s2, String s3) {
        int n1 = s1.length(), n2 = s2.length(), n3 = s3.length();
        if(n1 == 0) {
            return s3.equals(s2);
        }
        if(n2 == 0) {
            return s3.equals(s1);
        }
        if(n1 + n2 != n3) {
            return false;
        }
        boolean[][] dp = new boolean[n1 + 1][n2 + 1];
        dp[0][0] = true;
        for(int i = 1; i < n1 + 1; i++) {
            if(dp[i - 1][0] && s3.charAt(i - 1) == s1.charAt(i - 1)) {
                dp[i][0] = true;
            }
        }
        for(int i = 1; i < n2 + 1; i++) {
            if(dp[0][i - 1] && s3.charAt(i - 1) == s2.charAt(i - 1)) {
                dp[0][i] = true;
            }
        }
        for(int i = 1; i < n1 + 1; i++) {
            for(int j = 1; j < n2 + 1; j++) {
                dp[i][j] = dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1);
                dp[i][j] = dp[i][j] || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
            }
        }
        return dp[n1][n2];
    }
}
