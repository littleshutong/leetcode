package com.mapbar.misc;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring395 {

    public int longestSubstring2(String s, int k) {
        int len = s.length();
        if (len == 0 || k > len) return 0;
        if (k < 2) return len;
        return count(s.toCharArray(), k, 0, len - 1);
    }

    /**
     * 字符串长度， p1字符串开始位置，p2字符串结束位置
     * @param chars
     * @param k
     * @param p1
     * @param p2
     * @return
     */
    private static int count(char[] chars, int k, int p1, int p2) {
        // 字符串长度小于k
        if (p2 - p1 + 1 < k) return 0;
        int[] times = new int[26];  //  26个字母
        //  统计出现频次
        for (int i = p1; i <= p2; ++i) {
            ++times[chars[i] - 'a'];
        }
        //  如果该字符出现频次小于k，则不可能出现在结果子串中
        //  分别排除，然后挪动两个指针
        while (p2 - p1 + 1 >= k && times[chars[p1] - 'a'] < k) {
            ++p1;
        }
        while (p2 - p1 + 1 >= k && times[chars[p2] - 'a'] < k) {
            --p2;
        }

        if (p2 - p1 + 1 < k) return 0;
        //  得到临时子串，再递归处理
        for (int i = p1; i <= p2; ++i) {
            //  如果第i个不符合要求，切分成左右两段分别递归求得
            if (times[chars[i] - 'a'] < k) {
                return Math.max(count(chars, k, p1, i - 1), count(chars, k, i + 1, p2));
            }
        }
        return p2 - p1 + 1;
    }

    public int longestSubstring(String s, int k) {
        Map<Character, Integer> count = count(s);
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            if(count.get(s.charAt(i)) < k) {
                continue;
            }
            for(int j = i + 1; j < s.length() + 1; j++) {
                String sub = s.substring(i, j);
                if(isValid(sub, k)) {
                    max = Math.max(max, j - i);
                }
            }
        }
        return max;
    }

    private Map<Character, Integer> count(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        return map;
    }

    private boolean isValid(String sub, int k) {
        Map<Character, Integer> map = count(sub);
        for(Character character : map.keySet()) {
            if(map.getOrDefault(character, 0) < k) {
                return false;
            }
        }
        return true;
    }
}
