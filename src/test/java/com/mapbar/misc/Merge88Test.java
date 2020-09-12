package com.mapbar.misc;

import org.junit.Test;

import static org.junit.Assert.*;

public class Merge88Test {

    private Merge88 merge88 = new Merge88();

    @Test
    public void merge() {
        merge88.merge(new int[]{4,0,0,0,0,0}, 1, new int[]{1,2,3,5,6}, 5);
        merge88.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
        merge88.merge(new int[]{0}, 0, new int[]{6}, 1);
    }
}