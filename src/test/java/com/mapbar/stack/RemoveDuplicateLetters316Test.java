package com.mapbar.stack;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicateLetters316Test {

    private RemoveDuplicateLetters316 removeDuplicateLetters316 = new RemoveDuplicateLetters316();

    @Test
    public void removeDuplicateLetters() {
        Assert.assertEquals("abc", removeDuplicateLetters316.removeDuplicateLetters("bcabc"));
        Assert.assertEquals("acdb", removeDuplicateLetters316.removeDuplicateLetters("cbacdcbc"));
    }
}