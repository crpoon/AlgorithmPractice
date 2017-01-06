package com.crpoon.leetcode.medium;

public class LongestPalindromicSubstring_5 {
	public String longestPalindrome(String s) {
        if (s.isEmpty()) {
            return "";
        }
        int indexBegin = 0;
        int length = 1;
        boolean[][] truthTable = new boolean[s.length()][s.length()];
        
        // Initialize Base case
        for (int i = 0; i < s.length(); i++) {
            truthTable[i][i] = true;
        }
        
        // Initialize 2nd Base case
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                truthTable[i][i+1] = true;
                length = 2;
                indexBegin = i;
            }
        }
        
        // Real check
        for (int l = 3; l <= s.length(); l++) {
            for (int i = 0; i < s.length() - l + 1; i++) {
                int j = i + l - 1;
                if (s.charAt(i) == s.charAt(j) && truthTable[i+1][j-1]) {
                    truthTable[i][j] = true;
                    indexBegin = i;
                    length = l;
                }
            }
        }
        return s.substring(indexBegin, indexBegin + length);
    }
}
