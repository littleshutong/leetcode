package com.mapbar.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAnagrams438 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        int right = 0, left = 0, valid = 0;
        // p字符信息加入到need中
        for(char ch : p.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }
        // 滑动窗口从左向右移动
        while(right < s.length()) {
            char ch = s.charAt(right);
            right++;
            if(need.containsKey(ch)) {
                window.put(ch, window.getOrDefault(ch, 0) + 1);
                if(window.get(ch).intValue() == need.get(ch).intValue()) {
                    valid++;
                }
            }
            while(right - left >= p.length()) {
                if(valid == need.size()) {
                    ans.add(left);
                }
                ch = s.charAt(left);
                left++;
                if(need.containsKey(ch)) {
                    if(need.get(ch).intValue() == window.get(ch).intValue()) {
                        valid--;
                    }
                    window.put(ch, window.get(ch) - 1);
                }
            }
        }
        return ans;
    }
}
