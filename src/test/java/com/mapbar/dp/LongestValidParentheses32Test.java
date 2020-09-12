package com.mapbar.dp;

import com.mapbar.util.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestValidParentheses32Test {

    private LongestValidParentheses32 longestValidParentheses32 = new LongestValidParentheses32();

    @Test
    public void longestValidParentheses() {
        Assert.assertEquals(2, longestValidParentheses32.longestValidParentheses("(()"));
        Assert.assertEquals(4, longestValidParentheses32.longestValidParentheses(")()())"));
        Assert.assertEquals(14, longestValidParentheses32.longestValidParentheses("()()()()()()()))"));
        Assert.assertEquals(16, longestValidParentheses32.longestValidParentheses("(()()()()()()()))"));
        Assert.assertEquals(6, longestValidParentheses32.longestValidParentheses("(())()"));
        //Assert.assertEquals(, longestValidParentheses32.longestValidParentheses(")(((((()())"));
        Assert.assertEquals(22, longestValidParentheses32.longestValidParentheses("((((()())()()))()(()))"));
        Assert.assertEquals(22, longestValidParentheses32.longestValidParentheses(")(((((()())()()))()(()))("));

        System.out.println(longestValidParentheses32.longestValidParentheses("))())(()))()(((()())(()(((()))))((()(())()((((()))())))())))()(()(()))))" +
                "())(((())(()()))((())()())((()))(()(())(())((())((((()())()))((()(())()))()(()))))))()))(()))))()())()())()()()()()()()))()(((()()((()(())((()(" +
                "))))(()())))))))(()()(())())(()))))))()()())((((()()()())))))((())(())()()(()((()()))()()())(()())()))()(()(()())))))())()(())(()))(())()(())()" +
                "((())()((((()()))())(((((())))())())(()((())((()()((((((())))(((())))))))(()()((((((()(((())()(()))(()())((()(((()((()(())())()())(((()))()(((()))))" +
                "(())))(())()())()(((()))))((())())))())()()))((((()))(())()())()(((())(())(()()((())()())()()())())))((()())(()((()()()(()())(()))(()())((((()(()(((()" +
                "(((())()((()(()))())()())))))))))))()())()(()(((())()))(((()))((((()())())(()())((()())(()()((()((((()())))()(())(())()))))(())())))))(((((((())(((((()))()" +
                "))(()()()()))))))(()(()(()(()()(((()()))((()))())((())())()())()))()()(((())))()(())()()(())))(((()))))))))(())((()((()((()))))()()()((())((((((((((()(())))(" +
                "())((()(()())())(((((((()()()()))())(((()())()(()()))))(()()))))(((()()((()()()(((()))))(()()())()()()(()))))()(())))))))()((((((((()((())))))))(()))()((()())())("));
    }
}