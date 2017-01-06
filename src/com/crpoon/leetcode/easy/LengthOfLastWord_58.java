package com.crpoon.leetcode.easy;

public class LengthOfLastWord_58 {
	public int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        if (split.length < 1) return 0;
        return split[split.length - 1].length();
    }
}
