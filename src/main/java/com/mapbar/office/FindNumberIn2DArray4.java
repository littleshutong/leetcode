package com.mapbar.office;

public class FindNumberIn2DArray4 {


    /**
     * 思路从右上角出发进行寻找
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = 0, col = n - 1;
        while(row < m && col > -1) {
            if(matrix[row][col] == target) {
                return true;
            }
            if(matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }
}
