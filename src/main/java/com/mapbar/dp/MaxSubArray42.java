package com.mapbar.dp;

import com.mapbar.util.Assert;

public class MaxSubArray42 {
    public static void main(String[] args) {
        MaxSubArray42 maxSubArray42 = new MaxSubArray42();
        Assert.assertEquals(maxSubArray42.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}), 6);
        Assert.assertEquals(maxSubArray42.maxSubArray(new int[]{-2}), -2);
        Assert.assertEquals(maxSubArray42.maxSubArray(new int[]{-2, 0, 1, -1, 5}), 5);

        Assert.assertEquals(maxSubArray42.maxSubArray2(new int[]{-2,1,-3,4,-1,2,1,-5,4}), 6);
        Assert.assertEquals(maxSubArray42.maxSubArray2(new int[]{-2}), -2);
        Assert.assertEquals(maxSubArray42.maxSubArray2(new int[]{-2, 0, 1, -1, 5}), 5);
    }

    /**
     * 思路：动态规划
     * 定义：dp[i] 数组位置为i时，当前子序列最大和。
     * 状态转移方程： dp[i] = max(dp[i - 1] + nums[i], nums[i]);
     * basic case:  dp[0] = nums[0];
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n == 0) {
            return 0;
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        for(int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
        }

        int max = dp[0];
        for(int i = 1; i < n; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    /**
     * 优化方案，节约计算次数。 算最大值直接在第一个for循环，dp值记录dp[i - 1]的值
     * @param nums
     * @return
     */
    public int maxSubArray2(int[] nums) {
        int n = nums.length;
        if(n == 0) {
            return 0;
        }
        int cur = nums[0];
        int ans = nums[0];
        for(int i = 1; i < n; i++) {
            if(cur >= 0) {
                cur += nums[i];
            } else {
                cur = nums[i];
            }
            ans = Math.max(cur, ans);
        }
        return ans;
    }
}
