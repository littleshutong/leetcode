package com.mapbar.misc;

import com.mapbar.util.PrintUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CombinationSum216Test {

    private CombinationSum216 combinationSum216 = new CombinationSum216();

    @Test
    public void combinationSum3() {
        List<List<Integer>> lists = combinationSum216.combinationSum3(3, 9);
        for(List<Integer> list : lists) {
            System.out.println(PrintUtil.printList(list));
        }

    }
}