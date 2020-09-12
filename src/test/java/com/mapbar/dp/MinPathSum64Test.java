package com.mapbar.dp;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinPathSum64Test {

    private MinPathSum64 minPathSum64 = new MinPathSum64();

    @Test
    public void minPathSum() {
        Assert.assertEquals(7, minPathSum64.minPathSum(new int[][]{{1,3,1}, {1,5,1}, {4,2,1}}));
        Assert.assertEquals(7, minPathSum64.minPathSum(new int[][]{{1,2}, {3,4}}));
    }
}