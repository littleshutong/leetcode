package com.mapbar.misc;

import com.mapbar.util.PrintUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Subsets78Test {

    private Subsets78 subsets78 = new Subsets78();

    @Test
    public void subsets() {
        for(List<Integer> list : subsets78.subsets(new int[]{1,2,3})) {
            System.out.println(PrintUtil.printList(list));
        }
    }

}