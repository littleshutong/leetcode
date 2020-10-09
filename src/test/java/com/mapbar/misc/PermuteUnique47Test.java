package com.mapbar.misc;

import com.mapbar.util.PrintUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PermuteUnique47Test {

    private PermuteUnique47 permuteUnique47 = new PermuteUnique47();

    @Test
    public void permuteUnique() {
        List<List<Integer>> lists = permuteUnique47.permuteUnique(new int[]{1, 2, 1});
        for(List<Integer> list : lists) {
            System.out.println(PrintUtil.printList(list));
        }
    }
}