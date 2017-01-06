package com.crpoon.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharInString_387 {
	public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, -1);
            } else {
                map.put(c, i);
            }
        }
        
        int lowestIndex = Integer.MAX_VALUE;
        
        for (Character c : map.keySet()) {
            int count = map.get(c);
            if (count != -1) {
                lowestIndex = Math.min(count, lowestIndex);
            }
        }
        return lowestIndex == Integer.MAX_VALUE ? -1 : lowestIndex;
    }
}
