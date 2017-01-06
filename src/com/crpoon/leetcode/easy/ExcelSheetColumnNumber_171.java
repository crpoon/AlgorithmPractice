package com.crpoon.leetcode.easy;

public class ExcelSheetColumnNumber_171 {
	public int titleToNumber(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count = (26 * count) + (s.charAt(i) - 'A' + 1);
        }
        return count;
    }
}
