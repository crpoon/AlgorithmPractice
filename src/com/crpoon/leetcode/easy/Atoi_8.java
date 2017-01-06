package com.crpoon.leetcode.easy;

public class Atoi_8 {
	public int myAtoi(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        
        str = str.trim();
        
        boolean neg = false;
        int i = 0;
        if (str.charAt(0) == '-') {
            neg = true;
            i = 1;
        } else if (str.charAt(0) == '+') {
            i = 1;
        }
        
        double result = 0;
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = (result * 10) + (str.charAt(i) - '0');
            i++;
        }
        
        if (neg) {
            result = -1 * result;
        }
        
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return (int) result;
        }
    }
}
