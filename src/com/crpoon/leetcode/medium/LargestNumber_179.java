package com.crpoon.leetcode.medium;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber_179 {
	public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }
        
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }
        
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String str1 = s1 + s2; // 9 + 8 = 98 ; 99 + 97 = 9997
                String str2 = s2 + s1; // 8 + 9 = 89 ; 97 + 99 = 9799
                return str2.compareTo(str1); // 89 < 98, so s1 comes before s2; 9799 < 9997
            }
        };
        
        Arrays.sort(strings, comparator);
        if (strings[0].charAt(0) == '0') {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i]);
        }
        return sb.toString();
    }
}
