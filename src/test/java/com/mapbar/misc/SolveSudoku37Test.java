package com.mapbar.misc;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolveSudoku37Test {

    private SolveSudoku37 solveSudoku37 = new SolveSudoku37();

    @Test
    public void solveSudoku() {
        char[][] borad = new char[][] {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        solveSudoku37.solveSudoku(borad);
        for(int i = 0; i < borad.length; i++) {
            for(int j = 0; j < borad[0].length; j++) {
                System.out.print(borad[i][j]);
            }
            System.out.println(borad);
        }
    }
}