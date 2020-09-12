package com.mapbar.dp;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindrome5Test {

    private LongestPalindrome5 longestPalindrome5 = new LongestPalindrome5();

    @Test
    public void longestPalindrome() {
        Assert.assertEquals("aaaaaa", longestPalindrome5.longestPalindrome("aaaaaa"));
        Assert.assertEquals("ababa", longestPalindrome5.longestPalindrome("ababac"));
        Assert.assertEquals("bb", longestPalindrome5.longestPalindrome("cbbd"));
        Assert.assertEquals("dddddddddddddddddddbbbbbbbbbbbbbbbbbbbbbbbbddddddddddddddddddd",
                longestPalindrome5.longestPalindrome(
                        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadddddddddddddddddddbbbbbbbbbbbbbbbbbbbbbbbbdddddddddddddddddddddddddddddddddaaaaaaaaaaaaaaaaaaaaaaaa"));

        Assert.assertEquals("sknks",
                longestPalindrome5.longestPalindrome(
                        "jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszf" +
                                "tuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgj" +
                                "ryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccy" +
                                "rqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpiel"));

    }
}