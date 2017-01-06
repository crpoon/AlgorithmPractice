package com.crpoon.leetcode.easy;

public class ReverseString_344 {
	public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
