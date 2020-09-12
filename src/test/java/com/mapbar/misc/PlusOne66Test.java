package com.mapbar.misc;

import com.mapbar.util.PrintUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PlusOne66Test {

    private PlusOne66 plusOne66 = new PlusOne66();

    @Test
    public void plusOne() {
        Assert.assertArrayEquals(new int[]{1,2,3,5}, plusOne66.plusOne(new int[]{1,2,3,4}));
        Assert.assertArrayEquals(new int[]{1,0,0,0}, plusOne66.plusOne(new int[]{9,9,9}));
        Assert.assertArrayEquals(new int[]{1,0}, plusOne66.plusOne(new int[]{9}));

        Assert.assertArrayEquals(new int[]{1,2,3,5}, plusOne66.plusOne2(new int[]{1,2,3,4}));
        Assert.assertArrayEquals(new int[]{1,0,0,0}, plusOne66.plusOne2(new int[]{9,9,9}));
        Assert.assertArrayEquals(new int[]{1,0}, plusOne66.plusOne2(new int[]{9}));
    }
}