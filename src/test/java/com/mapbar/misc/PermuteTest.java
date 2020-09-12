package com.mapbar.misc;

import com.mapbar.util.PrintUtil;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PermuteTest {

    private Permute permute = new Permute();

    @Test
    public void permute() {
        List<List<Integer>> permutes = permute.permute(4);
        for(List<Integer> p :permutes) {
            System.out.println(PrintUtil.printList(p));
        }
    }
}