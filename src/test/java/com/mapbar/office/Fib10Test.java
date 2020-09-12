package com.mapbar.office;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Fib10Test {

    private Fib10 fib10 = new Fib10();

    @Test
    public void fib() {
        Assert.assertEquals(0, fib10.fib(0));
        Assert.assertEquals(1, fib10.fib(1));
        Assert.assertEquals(1, fib10.fib(2));
        Assert.assertEquals(2, fib10.fib(3));
        Assert.assertEquals(134903163, fib10.fib(45));
    }
}