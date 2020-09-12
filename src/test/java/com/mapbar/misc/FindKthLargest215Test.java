package com.mapbar.misc;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindKthLargest215Test {

    private FindKthLargest215 findKthLargest215 = new FindKthLargest215();

    @Test
    public void findKthLargest() {
        Assert.assertEquals(1, findKthLargest215.findKthLargest(new int[]{1,1,1}, 1));
        Assert.assertEquals(5, findKthLargest215.findKthLargest(new int[]{1,2,3,5,6,4}, 2));
        Assert.assertEquals(4, findKthLargest215.findKthLargest(new int[]{1,2,3,5,6,4}, 3));
        Assert.assertEquals(1, findKthLargest215.findKthLargest(new int[]{1,2,3,5,6,4}, 6));
        Assert.assertEquals(1, findKthLargest215.findKthLargest(new int[]{1,1,1,1,2}, 2));
        Assert.assertEquals(5, findKthLargest215.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
    }
}