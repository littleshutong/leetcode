package com.mapbar.misc;

import com.mapbar.util.PrintUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CombinationSum39Test {

    private CombinationSum39 combinationSum39 = new CombinationSum39();

    @Test
    public void combinationSum() {
        List<List<Integer>> lists = combinationSum39.combinationSum(new int[]{2,3,5}, 8);
        Assert.assertEquals(3, lists.size());
        Assert.assertArrayEquals(new Integer[]{2,2,2,2}, lists.get(0).toArray(new Integer[0]));
        Assert.assertArrayEquals(new Integer[]{2,3,3}, lists.get(1).toArray(new Integer[0]));
        Assert.assertArrayEquals(new Integer[]{3,5}, lists.get(2).toArray(new Integer[0]));
    }
}