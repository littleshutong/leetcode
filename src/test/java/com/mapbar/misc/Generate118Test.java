package com.mapbar.misc;

import com.mapbar.util.PrintUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Generate118Test {

    private Generate118 generate118 = new Generate118();

    @Test
    public void generate() {
        for(List<Integer> list : generate118.generate(4)) {
            System.out.println(PrintUtil.printList(list));
        }
    }
}