package com.mapbar.misc;

import com.mapbar.util.PrintUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolveNQueens51Test {

    private SolveNQueens51 solveNQueens51 = new SolveNQueens51();

    @Test
    public void solveNQueens() {
        List<List<String>> lists = solveNQueens51.solveNQueens(4);
        for(List<String> temp : lists) {
            System.out.println(PrintUtil.printList(temp));
        }

    }
}