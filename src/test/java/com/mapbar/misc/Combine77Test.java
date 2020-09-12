package com.mapbar.misc;

import com.mapbar.util.PrintUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Combine77Test {

    private Combine77 combine77 = new Combine77();

    @Test
    public void combine() {
        List<List<Integer>> lists = combine77.combine(4, 1);
        for(List<Integer> list : lists) {
            System.out.println(PrintUtil.printList(list));
        }

    }
}