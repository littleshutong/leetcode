package com.mapbar.misc;

public class Merge88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - 1;
        int p1 = m - 1, p2 = n - 1;
        while(p2 > -1 && p1 > -1) {
            if(nums2[p2] > nums1[p1]) {
                nums1[index] = nums2[p2];
                p2--;
            } else {
                nums1[index] = nums1[p1];
                p1--;
            }
            index--;
        }
        if(p2 > -1) {
            for(int i = p2; i > -1; i--) {
                nums1[i] = nums2[i];
            }
        }
    }
}
