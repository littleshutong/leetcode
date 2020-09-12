package com.mapbar.misc;

import com.mapbar.util.Assert;

public class RepeatedSubstringPattern459 {

    public static void main(String[] args) {
        RepeatedSubstringPattern459 repeatedSubstringPattern459 = new RepeatedSubstringPattern459();
        Assert.assertTrue(repeatedSubstringPattern459.repeatedSubstringPattern2("abab"));
        Assert.assertFalse(repeatedSubstringPattern459.repeatedSubstringPattern2("aba"));
        Assert.assertFalse(repeatedSubstringPattern459.repeatedSubstringPattern2("a"));
    }

    /**
     * 从1到n/2进行判断是否是重复字符串
     * @param s
     * @return
     */
    public boolean repeatedSubstringPattern2(String s) {
        int n = s.length();
        for (int i = 1; i * 2 <= n; ++i) {
            // 字符串长度是i的倍数，才有可能是重复串构成的。
            if (n % i == 0) {
                boolean match = true;
                // 检验跨越i个字符后是否相等，不相等返回false；
                for (int j = i; j < n; ++j) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 失败超时
     * @param s
     * @return
     */
    public boolean repeatedSubstringPattern(String s) {
        if(s == null || s.length() <= 1) {
            return false;
        }
        int n = s.length();
        for(int i = 0; i < n / 2 + 1; i++) {
            if(s.replaceAll(s.substring(0, i), "").length() == 0) {
                return true;
            }
        }
        return false;
    }
}
