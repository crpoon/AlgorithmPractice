package com.crpoon.leetcode.easy;

public class FactorialTrailingZeroes_172 {
	public int trailingZeroes(int n) {
        if (n < 5) {
            return 0;
        }
        int n5 = n / 5;
        return n5 + trailingZeroes(n5);
    }
}
