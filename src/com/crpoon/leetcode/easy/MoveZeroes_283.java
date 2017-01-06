package com.crpoon.leetcode.easy;

public class MoveZeroes_283 {
	public void moveZeroes(int[] nums) {
        int offset = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                offset++;
            } else {
                nums[i - offset] = nums[i];
            }
        }
        
        for (int i = nums.length - offset; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
