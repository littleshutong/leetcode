package com.mapbar.heap;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxPQTest {

    class IntWrap implements Comparable<IntWrap> {

        private int value;

        public IntWrap(int value) {
            this.value = value;
        }

        @Override
        public int compareTo(IntWrap o) {
            return new Integer(value).compareTo(o.value);
        }
    }

    private MaxPQ<IntWrap> maxPQ = new MaxPQ<IntWrap>(5);

    @Test
    public void test() {
        // int[] arr = new int[]{9, 5, 5, 4, 3};
        int[] arr = new int[]{3, 4, 5, 5, 9};
        IntWrap[] intWraps = new IntWrap[5];
        for (int i = 0; i < intWraps.length; i++) {
            intWraps[i] = new IntWrap(arr[i]);
            maxPQ.insert(intWraps[i]);
        }
        Assert.assertTrue(maxPQ.max().value == 9);
        Assert.assertTrue(maxPQ.delMax().value == 9);
        maxPQ.insert(new IntWrap(6));
        maxPQ.insert(new IntWrap(4));
        maxPQ.insert(new IntWrap(7));
        Assert.assertTrue(maxPQ.delMax().value == 7);
        Assert.assertTrue(maxPQ.delMax().value == 6);
        Assert.assertTrue(maxPQ.delMax().value == 5);
        Assert.assertTrue(maxPQ.delMax().value == 5);
        Assert.assertTrue(maxPQ.delMax().value == 4);
        Assert.assertTrue(maxPQ.delMax().value == 4);
        Assert.assertTrue(maxPQ.delMax().value == 3);
    }

}