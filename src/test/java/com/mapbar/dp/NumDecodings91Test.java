package com.mapbar.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumDecodings91Test {

    private NumDecodings91 numDecodings91 = new NumDecodings91();

    @Test
    public void numDecodings() {
        Assert.assertEquals(2, numDecodings91.numDecodings("12"));
        Assert.assertEquals(2, numDecodings91.numDecodings("11"));
        Assert.assertEquals(3, numDecodings91.numDecodings("226"));
        Assert.assertEquals(96, numDecodings91.numDecodings("1262626262626"));
        Assert.assertEquals(0, numDecodings91.numDecodings("00"));
        Assert.assertEquals(1, numDecodings91.numDecodings("10"));
        Assert.assertEquals(0, numDecodings91.numDecodings("100"));
        Assert.assertEquals(1, numDecodings91.numDecodings("101"));
        Assert.assertEquals(0, numDecodings91.numDecodings("1001"));
        Assert.assertEquals(0, numDecodings91.numDecodings("01"));
        Assert.assertEquals(1, numDecodings91.numDecodings("110"));
        Assert.assertEquals(0, numDecodings91.numDecodings("010"));
        Assert.assertEquals(1, numDecodings91.numDecodings("1010"));
        Assert.assertEquals(1, numDecodings91.numDecodings("102010101012020202"));
        Assert.assertEquals(2, numDecodings91.numDecodings("101010101010101010101012"));
    }
}