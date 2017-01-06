package com.crpoon.leetcode.medium;

public class CountingBits_338 {
	public int[] countBits(int num) {
        int[] ones = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            ones[i] = ones[i/2] + (i & 1);
        }
        return ones;
    }
}
