package com.mapbar.stack;

import java.util.Stack;

/**
 * https://mp.weixin.qq.com/s?__biz=MzAxODQxMDM0Mw==&mid=2247486946&idx=1&sn=94804eb15be33428582544a1cd90da4d&chksm=9bd7f3eaaca07afc6fdfa94d05fa3007d9ecc54914a238e6deabeafd5032a299155505b40f2d&scene=126&sessionid=1600042649&key=e534089e1c3a5a832674c2a687e24d878d685b329106b2e1da1af8833e1810380b80f109bd5953b35b535e7a58566627336633cf0ffff9af93f2558cddf3375937847f84ac3f82299ac53bff6cd1ee77272145d6b5a85e3edcb76e8ed6bcd1d941bdbefe7d88e9000e0dba60f1d903aa415a8ad62ed9849eeb996290b2d5aa37&ascene=1&uin=MTA4NTQ0MzEyMg%3D%3D&devicetype=Windows+10+x64&version=62090529&lang=zh_CN&exportkey=ARPIu248ZFpoJbfAp6IIA%2BE%3D&pass_ticket=xGpNJNFk%2FOOzsFlDNimNrupbUynuAhuepfFQbMT69n0R0KlDb1yYirfb%2FdQGNA%2B9&wx_header=0
 * labuladong算法题，字符去重。
 */
public class RemoveDuplicateLetters316 {

    public String removeDuplicateLetters(String s) {
        // 栈存放放入字符
        Stack<Character> stack = new Stack<>();
        // 数组判断是否在栈中
        boolean[] inStack = new boolean[256];
        // 统计字符数量
        int[] count = new int[256];
        char[] chs = s.toCharArray();
        for(char ch : chs) {
            count[ch]++;
        }
        // 主要逻辑
        for(char ch : s.toCharArray()) {
            count[ch]--;
            if(inStack[ch]) {
                continue;
            }
            while(!stack.isEmpty() && stack.peek() > ch) {
                if(count[stack.peek()] == 0) {
                    break;
                }
                inStack[stack.pop()] = false;
            }
            stack.push(ch);
            inStack[ch] = true;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
