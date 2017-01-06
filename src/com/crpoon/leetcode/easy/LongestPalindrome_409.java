package com.crpoon.leetcode.easy;

public class LongestPalindrome_409 {
	public int longestPalindrome(String s) {
        boolean[] freq = new boolean[128];
        int pairs = 0;
        for (char c : s.toCharArray()) {
            if (freq[c]) pairs++;
            freq[c] = !freq[c];
        }
        pairs *= 2;
        return pairs < s.length() ? pairs + 1 : pairs;
    }
}
