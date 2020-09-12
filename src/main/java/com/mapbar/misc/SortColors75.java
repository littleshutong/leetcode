package com.mapbar.misc;

public class SortColors75 {

    public void sortColors(int[] nums) {
        int i = 0,j = nums.length - 1;
        for(int k = 0; k < nums.length; i++) {
            if(nums[k] == 0 && k > i) {
                swap(i, k, nums);
                i++;
            }
            if(nums[k] == 2) {
                swap(j, k, nums);
                j--;
            }
        }
    }

    private void swap(int i, int j, int[] nums) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }
}
