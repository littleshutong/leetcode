package com.mapbar.misc;

import com.mapbar.util.Assert;

public class CanJump55 {

    public static void main(String[] args) {
        CanJump55 canJump55 = new CanJump55();
        Assert.assertTrue(canJump55.canJump(new int[]{2,3,1,1,4}));
        Assert.assertTrue(canJump55.canJump(new int[]{0}));
        Assert.assertTrue(canJump55.canJump(new int[]{2,0,0}));
        Assert.assertFalse(canJump55.canJump(new int[]{3,2,1,0,4}));

        Assert.assertTrue(canJump55.canJump2(new int[]{2,3,1,1,4}));
        Assert.assertTrue(canJump55.canJump2(new int[]{0}));
        Assert.assertTrue(canJump55.canJump2(new int[]{2,0,0}));
        Assert.assertFalse(canJump55.canJump2(new int[]{3,2,1,0,4}));
    }

    /**
     * 贪心算法，每次求最远距离。效率比动态规划高。
     * @param nums
     * @return
     */
    public boolean canJump2(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                return false;
            }
            k = Math.max(k, i + nums[i]);
        }
        return true;
    }

    /**
     * 动态规划解法
     * @param nums
     * @return
     */
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n <= 1) {
            return true;
        }
        boolean[] dp = new boolean[n];
        dp[0] = true;
        for(int i = 1; i < n; i++) {
            int j = i;
            while(j-- > 0 & !dp[i]) {
                if(dp[j] && nums[j] >= i - j) {
                    dp[i] = true;
                }
            }
        }
        return dp[n - 1];
    }
}
