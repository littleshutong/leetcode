package com.mapbar.misc;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstring395Test {

    private LongestSubstring395 longestSubstring395 = new LongestSubstring395();

    @Test
    public void longestSubstring() {
        Assert.assertEquals(3, longestSubstring395.longestSubstring("aaabb", 3));
        Assert.assertEquals(5, longestSubstring395.longestSubstring("ababbc", 2));
        Assert.assertEquals(6, longestSubstring395.longestSubstring("ababbc", 1));
        Assert.assertEquals(6, longestSubstring395.longestSubstring("ababbc", 0));
    }
}