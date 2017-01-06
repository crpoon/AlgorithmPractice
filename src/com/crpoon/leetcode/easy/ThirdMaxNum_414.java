package com.crpoon.leetcode.easy;

public class ThirdMaxNum_414 {
	public int thirdMax(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        long max = Long.MIN_VALUE; 
        long twoMax = Long.MIN_VALUE;
        long threeMax = Long.MIN_VALUE;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max || nums[i] == twoMax) {
                continue;
            }
            
            if (nums[i] > max) {
                threeMax = twoMax;
                twoMax = max;
                max = nums[i];
            } else if (nums[i] > twoMax) {
                threeMax = twoMax;
                twoMax = nums[i];
            } else if (nums[i] > threeMax) {
                threeMax = nums[i];
            }
            count++;
        }
        
        if (count > 2) {
            return (int) threeMax;
        } else {
            return (int) max;
        }
    }
}
