package com.mapbar.misc;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring3 {

    public int lengthOfLongestSubstring(String s) {
        int max = 0, left = 0, right = 0;
        // map收集right前进的字符
        Map<Character, Integer> map = new HashMap<>();
        while(right < s.length()) {
            char ch = s.charAt(right);
            right++;
            // map中没有出现字符，继续添加。如果出现从左侧不断移除，直到没有为止。
            while(map.containsKey(ch)) {
                char c = s.charAt(left);
                left++;
                map.remove(c);
            }
            map.put(ch, 1);
            max = Math.max(max, map.size());
        }
        return max;
    }
}
