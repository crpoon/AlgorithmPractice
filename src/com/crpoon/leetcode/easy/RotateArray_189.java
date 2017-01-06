package com.crpoon.leetcode.easy;

public class RotateArray_189 {
	public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int[] hold = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            hold[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = hold[i];
        }
    }
}
