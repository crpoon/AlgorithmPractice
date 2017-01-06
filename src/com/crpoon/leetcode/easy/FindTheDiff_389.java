package com.crpoon.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class FindTheDiff_389 {
	public char findTheDifference(String s, String t) {
        if (s == null || t == null) {
            return '0';
        }
        
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (frequencyMap.containsKey(c)) {
                frequencyMap.put(c, frequencyMap.get(c) + 1);
            } else {
                frequencyMap.put(c, 1);
            }
        }
        
        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            if (frequencyMap.containsKey(c)) {
                Integer freq = frequencyMap.get(c);
                if (freq == 0) {
                    return c;
                } else {
                    frequencyMap.put(c, freq - 1);
                }
            } else {
                return c;
            }
        }
        
        return '0';
    }
}
