package com.mapbar.dp;

import java.util.HashSet;
import java.util.Set;

public class LongestValidParentheses32 {

    public int longestValidParentheses2(String s) {
        int maxans = 0;
        int dp[] = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                maxans = Math.max(maxans, dp[i]);
            }
        }
        return maxans;
    }

    // 错误解答，使用一个变脸即可
    /**
     * 状态定义：dp[i][j]，位置i到位置j的值dp[i][j]是否为有效括号
     * 状态转移方程：dp[i][j] = (dp[i + 1][j - 1] && s[i] == '(' && s[j] == ')')
     *                       || (dp[i][j - 2] && s[j - 1] == '(' && s[j] == ')')
     *                       || (dp[i + 2][j] && s[i] == '(' && s[i + 1] == ')')
     * basic case 紧邻成对出现有效括号为True，只是用矩形的右上部分。
     *
     * @param s
     * @return
     */
    public int longestValidParentheses(String s) {
        int n = s.length();
        if(n == 0) {
            return 0;
        }
        boolean[][] dp = new boolean[n][n];
        // 初始化
        char[] chs = s.toCharArray();
        int i = 1, max = 0;
        while(i < n) {
            if(chs[i - 1] == '(' && chs[i] == ')') {
                max = 2;
                dp[i - 1][i] = true;
                i++;
            }
            i++;
        }
        for(i = n - 3; i > -1; i--) {
            Set<Integer> set = new HashSet<>();
            for(int j = i + 2; j < n; j++) {
                dp[i][j] = (dp[i + 1][j - 1] && chs[i] == '(' && chs[j] == ')')
                          || (dp[i][j - 2] && chs[j - 1] == '(' && chs[j] == ')')
                          || (dp[i + 2][j] && chs[i] == '(' && chs[i + 1] == ')');
                if(dp[i][j]) {
                    max = Math.max(max, j - i + 1);
                    set.add(j);
                } else {
                    for(int k : set) {
                        dp[i][j] = dp[i][k] && dp[k + 1][j];
                        if(dp[i][j]) {
                            max = Math.max(max, j - i + 1);
                            break;
                        }
                    }
                }
            }
        }
        return max;
    }
}
