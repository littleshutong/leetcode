package com.mapbar.misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlusOne66 {

    /**
     * 方法好，加1后不是零可以直接返回。如果为0下一个加1。继续判断。都为零第一位，置1。
     * @param digits
     * @return
     */
    public int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }


    public int[] plusOne(int[] digits) {
        if(digits.length == 0) {
            return new int[]{1};
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = digits.length - 1; i > -1; i--) {
            ans.add(digits[i]);
        }
        int plus = 1;
        for(int i = 0; i < ans.size(); i++) {
            int a = ans.get(i) + plus;
            ans.set(i,  a % 10);
            plus = a / 10;
        }
        if(plus > 0) {
            ans.add(ans.size(), plus);
        }
        Collections.reverse(ans);
        return ans.stream().mapToInt(Integer::valueOf).toArray();
    }
}
