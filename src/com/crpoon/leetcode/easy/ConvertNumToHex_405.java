package com.crpoon.leetcode.easy;

public class ConvertNumToHex_405 {
	public String toHex(int num) {
        if (num == 0) return "0";
        
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int digit = num & 0xf;
            sb.append((digit > 9) ? (char) (digit - 10 + 'a') : (char) (digit + '0'));
            num >>>= 4;
        }
        return sb.reverse().toString();
    }
}
