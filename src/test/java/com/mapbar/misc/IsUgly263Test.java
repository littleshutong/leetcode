package com.mapbar.misc;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsUgly263Test {

    private IsUgly263 isUgly263 = new IsUgly263();

    @Test
    public void isUgly() {
        Assert.assertTrue(isUgly263.isUgly(1));
        Assert.assertTrue(isUgly263.isUgly(2));
        Assert.assertTrue(isUgly263.isUgly(3));
        Assert.assertTrue(isUgly263.isUgly(4));
        Assert.assertTrue(isUgly263.isUgly(5));
        Assert.assertTrue(isUgly263.isUgly(6));
        Assert.assertTrue(isUgly263.isUgly(8));
        Assert.assertTrue(isUgly263.isUgly(10));
        Assert.assertTrue(isUgly263.isUgly(20));
        Assert.assertTrue(isUgly263.isUgly(100));
        Assert.assertTrue(isUgly263.isUgly(200));
    }
}