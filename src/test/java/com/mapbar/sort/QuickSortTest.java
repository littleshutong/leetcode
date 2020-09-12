package com.mapbar.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    private QuickSort quickSort = new QuickSort();

    @Test
    public void sort() {
        int[] nums = new int[]{4,3,2,1,3,5,6,7,7,9};
        quickSort.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
    }
}