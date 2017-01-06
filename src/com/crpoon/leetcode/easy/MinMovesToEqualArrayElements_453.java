package com.crpoon.leetcode.easy;

public class MinMovesToEqualArrayElements_453 {
	public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int n: nums) {
            min = Math.min(min, n);
            sum += n;
        }
        return sum - nums.length * min;
    }
}
