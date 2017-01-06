package com.crpoon.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters_3 {
	public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        
        Set<Character> set = new HashSet<>();
        int leftbound = 0;
        int max = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                max = Math.max(max, i - leftbound + 1);
            } else {
                while (leftbound < i && s.charAt(leftbound) != s.charAt(i)) {
                    set.remove(s.charAt(leftbound));
                    leftbound++;
                }
                leftbound++;
            }
        }
        return max;
    }
}
