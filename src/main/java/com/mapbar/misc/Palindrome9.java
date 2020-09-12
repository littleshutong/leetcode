package com.mapbar.misc;


import com.mapbar.util.Assert;

public class Palindrome9 {
    public static void main(String[] args) {
        Palindrome9 palindrome9 = new Palindrome9();
        Assert.assertTrue(palindrome9.isPalindrome(0));
        Assert.assertTrue(palindrome9.isPalindrome(121));
        Assert.assertTrue(palindrome9.isPalindrome(12121));
        Assert.assertFalse(palindrome9.isPalindrome(10));

        Assert.assertTrue(palindrome9.isPalindrome2(0));
        Assert.assertTrue(palindrome9.isPalindrome2(121));
        Assert.assertTrue(palindrome9.isPalindrome2(12121));
        Assert.assertFalse(palindrome9.isPalindrome2(10));
    }

    /**
     * 思路：反转数字的后半部分，然后和反转的数字进行比较。
     * @param x
     * @return
     */
    public boolean isPalindrome2(int x) {
        if(x < 0 || (x > 0 && x % 10 == 0)) {
            return false;
        }
        int y = 0;
        while(x > y) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return x == y || x == y / 10;
    }

    /**
     * 思路：每次找出第一位和最后一位进行比较，然后取出数字的第一位和最后一位。重复步骤
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int n = 0;
        int y = x;
        while(y != 0) {
            n++;
            y = y / 10;
        }
        for(int i = 0; i < n / 2; i++) {
            int e = x % 10;
            int pow = new Double(Math.pow(10, n - i * 2 - 1)).intValue();
            int s = x / pow;
            if(s != e) {
                return false;
            }
            x = x % pow;
            x = x / 10;
        }
        return true;
    }
}
