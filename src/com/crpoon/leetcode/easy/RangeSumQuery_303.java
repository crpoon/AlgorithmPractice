package com.crpoon.leetcode.easy;

public class RangeSumQuery_303 {
	public class NumArray {
	    
	    int[] sumArr;

	    public NumArray(int[] nums) {
	        for (int i = 1; i < nums.length; i++) {
	            nums[i] += nums[i-1];
	        }
	        this.sumArr = nums;
	    }

	    public int sumRange(int i, int j) {
	        if (i == 0) {
	            return sumArr[j];
	        } else {
	            return sumArr[j] - sumArr[i - 1];
	        }
	    }
	}
}
