package com.mapbar.misc;

/**
 * https://mp.weixin.qq.com/s/r9pbkMyFyMAvmkf4QnL-1g
 */
public class KMP {

    private int[][] dp;
    private String pat;

    public KMP(String pat) {
        this.pat = pat;
        // 通过pat计算dp
        int M = pat.length();
        // dp[状态][字符] = 下一个转台
        dp = new int[M][256];
        // basic case
        dp[0][pat.charAt(0)] = 1;
        // 影子节点
        int X = 0;
        for(int j = 1; j < M; j++) {
            for(int c = 0; c < 256; c++) {
                dp[j][c] = dp[X][c];
            }
            dp[j][pat.charAt(j)] = j + 1;
            // 更新影子状态
            X = dp[X][pat.charAt(j)];
        }
    }

    public int search(String txt) {
        int M = pat.length();
        int N = txt.length();
        // pat初始化状态为0
        int j = 0;
        for(int i = 0; i < N; i++) {
            j = dp[j][txt.charAt(i)];
            if(j == M) {
                return i - M + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        KMP kmp = new KMP("ababc");
        System.out.println(kmp.search("ababababc"));
    }
}
