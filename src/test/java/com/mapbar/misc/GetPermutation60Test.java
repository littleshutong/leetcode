package com.mapbar.misc;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetPermutation60Test {

    private GetPermutation60 getPermutation60 = new GetPermutation60();

    @Test
    public void getPermutation() {
        Assert.assertEquals("213", getPermutation60.getPermutation(3, 3));
        Assert.assertEquals("2314", getPermutation60.getPermutation(4, 9));
        Assert.assertEquals("1234", getPermutation60.getPermutation(4, 1));
        Assert.assertEquals("1432", getPermutation60.getPermutation(4, 6));


        Assert.assertEquals("213", getPermutation60.getPermutation2(3, 3));
        Assert.assertEquals("2314", getPermutation60.getPermutation2(4, 9));
        Assert.assertEquals("1234", getPermutation60.getPermutation2(4, 1));
        Assert.assertEquals("1432", getPermutation60.getPermutation2(4, 6));
    }
}