package com.crpoon.leetcode.easy;

public class PowerOfThree_326 {
	public boolean isPowerOfThree(int n) {
        return n > 0 && (1162261467 % n == 0);
    }
}
