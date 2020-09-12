package com.mapbar.sort;

import java.util.Collections;

public class QuickSort {

    public int[] sort(int nums[]) {
        int n = nums.length;
        if(n == 0) {
            return nums;
        }
        qsort(0, nums.length - 1, nums);
        return nums;
    }

    private void qsort(int left, int right, int[] nums) {
        if(left >= right) {
            return ;
        }
        int pivot = nums[left];
        int index = left - 1;
        for(int j = left; j <= right; j++) {
            if(nums[j] <= pivot) {
                swap(nums, ++index, j);
            }
        }
        // 防止没有进入for循环
        swap(nums, index + 1, left);
        qsort(left, index, nums);
        qsort(index + 1, right, nums);

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
