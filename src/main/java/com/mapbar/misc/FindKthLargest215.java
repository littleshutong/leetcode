package com.mapbar.misc;

import java.util.Arrays;
import java.util.Collections;

public class FindKthLargest215 {

    public int findKthLargest(int[] nums, int k) {
        if(nums.length == 0) {
            return -1;
        }
        return findKthLargest(nums, 0, nums.length - 1, nums.length - k);
    }

    int findKthLargest(int q[], int l, int r, int k) {
        if(l >= r) {
            return q[l];
        }
        /*int i = l - 1 ,j = r + 1, x = q[l];
        while(i < j){
            do ++i; while (q[i] < x);
            do --j; while (q[j] > x);
            if (i < j) {
                swap(q, i, j);
            }
        }*/
        int i = l, j = r, pivot = q[l];
        while (i < j) {
            while(i < j && q[j] >= pivot){
                j--;// 从右向左找第一个小于x的数
            }
            if(i < j)
                q[i++] = q[j];
            while(i < j && q[i] < pivot){
                i++;// 从左向右找第一个大于等于x的数
            }
            if(i < j) {
                q[j--] = q[i];
            }
        }
        q[i] = pivot;
        if(i - l == k) {
            return q[i];
        } else if(k < i - l) {
            return findKthLargest(q, l, j, k);
        } else if(k > i - l) {
            return findKthLargest(q, j + 1, r, k - (i - l + 1));
        }
        return -1;
    }

}
