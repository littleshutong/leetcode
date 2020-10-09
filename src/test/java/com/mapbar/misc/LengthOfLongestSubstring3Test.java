package com.mapbar.misc;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLongestSubstring3Test {

    private LengthOfLongestSubstring3 lengthOfLongestSubstring3 = new LengthOfLongestSubstring3();

    @Test
    public void lengthOfLongestSubstring() {
        Assert.assertEquals(3, lengthOfLongestSubstring3.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(1, lengthOfLongestSubstring3.lengthOfLongestSubstring("bbbbbbb"));
        Assert.assertEquals(3, lengthOfLongestSubstring3.lengthOfLongestSubstring("abcabcbcd"));
        Assert.assertEquals(1, lengthOfLongestSubstring3.lengthOfLongestSubstring(" "));
        Assert.assertEquals(2, lengthOfLongestSubstring3.lengthOfLongestSubstring("aab"));
    }
}