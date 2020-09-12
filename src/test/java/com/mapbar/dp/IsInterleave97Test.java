package com.mapbar.dp;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsInterleave97Test {

    private IsInterleave97 isInterleave97 = new IsInterleave97();

    @Test
    public void isInterleave() {
        Assert.assertTrue(isInterleave97.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        Assert.assertFalse(isInterleave97.isInterleave("aabcc", "dbbca", "aadbbcbcad"));
        Assert.assertFalse(isInterleave97.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
    }
}