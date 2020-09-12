package com.mapbar.misc;

import com.mapbar.util.Assert;
import com.mapbar.util.PrintUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SubsetsWithDup90Test {

    private SubsetsWithDup90 subsetsWithDup90 = new SubsetsWithDup90();

    @Test
    public void subsetsWithDup() {
        List<List<Integer>> lists = subsetsWithDup90.subsetsWithDup(new int[]{1,2,2});
        for(List<Integer> list : lists) {
            System.out.println(PrintUtil.printList(list));;
        }
    }
}