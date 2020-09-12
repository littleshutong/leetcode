package com.mapbar.office;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsNumber20Test {

    private IsNumber20 isNumber20 = new IsNumber20();

    @Test
    public void isNumber() {
        Assert.assertTrue(isNumber20.isNumber(".123"));
        Assert.assertFalse(isNumber20.isNumber("..123"));
        Assert.assertFalse(isNumber20.isNumber("12e+5.4"));
        Assert.assertFalse(isNumber20.isNumber("+-5"));
        Assert.assertFalse(isNumber20.isNumber("1.2.3"));
        Assert.assertFalse(isNumber20.isNumber("1a3.1"));
        Assert.assertFalse(isNumber20.isNumber("12e"));
        Assert.assertTrue(isNumber20.isNumber("12.0"));
        Assert.assertTrue(isNumber20.isNumber("12."));
        Assert.assertTrue(isNumber20.isNumber("0123"));
        Assert.assertTrue(isNumber20.isNumber("-.1"));
        Assert.assertFalse(isNumber20.isNumber("."));
        Assert.assertFalse(isNumber20.isNumber(" ."));
        Assert.assertFalse(isNumber20.isNumber("1 ."));
        Assert.assertTrue(isNumber20.isNumber("1 "));
        Assert.assertTrue(isNumber20.isNumber("-1E-16"));
        Assert.assertFalse(isNumber20.isNumber("G76"));
        Assert.assertFalse(isNumber20.isNumber("6+1"));
    }
}