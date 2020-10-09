package com.mapbar.misc;

public class SearchMatrix74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if(m == 0) {
            return false;
        }
        int n = matrix[0].length;
        if(n == 0) {
            return false;
        }
        int[] array = new int[m];
        for(int i = 0; i < m; i++) {
            array[i] = matrix[i][n - 1];
        }
        int start = binarySearch(array, target);
        if(start == -1) {
            return true;
        } else if(start >= m){
            return false;
        } else {
            start = binarySearch(matrix[start], target);
            if(start == -1) {
                return true;
            } else {
                return false;
            }
        }
    }

    public int binarySearch(int[] array, int target) {
        int left = 0, right = array.length;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(array[mid] == target) {
                return -1;
            } else if(array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
