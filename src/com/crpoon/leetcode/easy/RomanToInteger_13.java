package com.crpoon.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {
	public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int result = 0;
        char prev = '*';
        for (int i = s.length() - 1; i >=0; i--) {
            char c = s.charAt(i);
            int val = map.get(c);
            if (val < result && c != prev) {
                result -= val;
            } else {
                result += val;
            }
            prev = c;
        }
        return result;
    }
}
