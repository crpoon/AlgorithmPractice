package com.crpoon.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote_383 {
	public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote == null || magazine == null) {
            return false;
        } else if (ransomNote.isEmpty()) {
            return true;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : ransomNote.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        
        for (Character c : magazine.toCharArray()) {
            if (map.containsKey(c)) {
               Integer freq = map.get(c);
               if (freq <= 1) {
                   map.remove(c);
               } else {
                   map.put(c, freq - 1);
               }
            }
            
            if (map.keySet().isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
