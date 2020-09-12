package com.mapbar.misc;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TopKFrequent347Test {

    private TopKFrequent347 topKFrequent347 = new TopKFrequent347();

    @Test
    public void topKFrequent() {
        Assert.assertArrayEquals(new Integer[]{2, 1}, topKFrequent347.topKFrequent(new int[]{1,1,1,2,2,3}, 2).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{1}, topKFrequent347.topKFrequent(new int[]{1,1,1,2,3}, 1).toArray(new Integer[]{}));
        Assert.assertArrayEquals(new Integer[]{1}, topKFrequent347.topKFrequent(new int[]{1}, 1).toArray(new Integer[]{}));
    }
}