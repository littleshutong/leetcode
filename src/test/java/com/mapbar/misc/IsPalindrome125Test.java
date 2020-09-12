package com.mapbar.misc;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPalindrome125Test {

    private IsPalindrome125 isPalindrome125 = new IsPalindrome125();

    @Test
    public void isPalindrome() {
        Assert.assertTrue(isPalindrome125.isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertFalse(isPalindrome125.isPalindrome(" "));
    }
}