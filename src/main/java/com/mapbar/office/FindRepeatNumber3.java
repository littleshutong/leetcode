package com.mapbar.office;

public class FindRepeatNumber3 {

    /**
     * 交换位置，如果位置上符合要求，不进行操作。否者进行置换操作。
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            while(nums[i] != i) {
                if(nums[nums[i]] == nums[i]) {
                    return nums[i];
                }
                int t = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = t;
            }
        }
        return -1;
    }
}
