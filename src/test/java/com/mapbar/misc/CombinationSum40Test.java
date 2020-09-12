package com.mapbar.misc;

import com.mapbar.util.PrintUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CombinationSum40Test {

    private CombinationSum40 combinationSum40 = new CombinationSum40();

    @Test
    public void combinationSum2() {
        List<List<Integer>> lists = combinationSum40.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5, 1}, 8);
        for(List<Integer> list : lists) {
            System.out.println(PrintUtil.printList(list));
        }
    }
}