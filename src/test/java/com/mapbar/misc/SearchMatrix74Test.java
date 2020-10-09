package com.mapbar.misc;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchMatrix74Test {

    private SearchMatrix74 searchMatrix74 = new SearchMatrix74();

    @Test
    public void searchMatrix() {
        Assert.assertEquals(-1, searchMatrix74.binarySearch(new int[]{1,5,20}, 5));
        Assert.assertEquals(1, searchMatrix74.binarySearch(new int[]{1,5,20}, 3));
        Assert.assertEquals(3, searchMatrix74.binarySearch(new int[]{1,5,20}, 50));
        Assert.assertEquals(2, searchMatrix74.binarySearch(new int[]{1,5,20}, 18));
        Assert.assertEquals(2, searchMatrix74.binarySearch(new int[]{1,5,20}, 18));

        Assert.assertTrue(searchMatrix74.searchMatrix(new int[][]{{1,   3,  5,  7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 3));
        Assert.assertFalse(searchMatrix74.searchMatrix(new int[][]{{1,   3,  5,  7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 13));
        Assert.assertFalse(searchMatrix74.searchMatrix(new int[][]{{1}}, 0));
        Assert.assertFalse(searchMatrix74.searchMatrix(new int[][]{{1, 1}}, 0));
    }
}