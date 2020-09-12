package com.mapbar.misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolveNQueens51 {

    private List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] matrix = new char[n][n];
        for(int i = 0; i < n; i++) {
            Arrays.fill(matrix[i], '.');
        }
        backtrack(matrix, 0, n);
        return ans;
    }

    private void backtrack(char[][] matrix, int row, int n) {
        if(row == n) {
            addAns(matrix, n);
            return ;
        }
        if(row > n) {
            return ;
        }
        for(int i = 0; i < n; i++) {
            if(isVaild(matrix, row, i, n)) {
                matrix[row][i] = 'Q';
                backtrack(matrix,row + 1, n);
                matrix[row][i] = '.';
            }
        }
    }

    private boolean isVaild(char[][] matrix, int row, int col, int n) {
        // 检查列是否有皇后互相冲突
        for (int i = 0; i < n; i++) {
            if (matrix[i][col] == 'Q')
                return false;
        }
        // 检查右上方是否有皇后互相冲突
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n; i--, j++) {
            if (matrix[i][j] == 'Q')
                return false;
        }
        // 检查左上方是否有皇后互相冲突
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0; i--, j--) {
            if (matrix[i][j] == 'Q')
                return false;
        }
        return true;
    }

    private void addAns(char[][] matrix, int n) {
        List<String> temp = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++) {
                sb.append(matrix[i][j]);
            }
            temp.add(sb.toString());
        }
        ans.add(temp);
    }
}
