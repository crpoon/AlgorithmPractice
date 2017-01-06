package com.crpoon.leetcode.medium;

public class MissingNumber_268 {
	public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        
        int gauss = (n * (n + 1)) / 2;
        return gauss - sum;
    }
}
