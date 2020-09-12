package com.mapbar.office;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindNumberIn2DArray4Test {

    private FindNumberIn2DArray4 findNumberIn2DArray4 = new FindNumberIn2DArray4();

    @Test
    public void findNumberIn2DArray() {
        Assert.assertTrue(findNumberIn2DArray4.findNumberIn2DArray(new int[][]{{0, 1, 2},{3, 4, 5},{6, 7, 8} }, 8));
        Assert.assertFalse(findNumberIn2DArray4.findNumberIn2DArray(new int[][]{{0, 1, 2},{3, 4, 5},{6, 7, 8} }, 10));
    }
}