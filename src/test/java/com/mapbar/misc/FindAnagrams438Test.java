package com.mapbar.misc;

import com.mapbar.util.PrintUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FindAnagrams438Test {

    private FindAnagrams438 findAnagrams438 = new FindAnagrams438();

    @Test
    public void findAnagrams() {
        List<Integer> list = findAnagrams438.findAnagrams("cbaebabacd", "abc");
        Assert.assertArrayEquals(new int[]{0, 6}, list.stream().mapToInt(x->x).toArray());
        list = findAnagrams438.findAnagrams("abab", "ab");
        Assert.assertArrayEquals(new int[]{0, 1, 2}, list.stream().mapToInt(x->x).toArray());
    }
}