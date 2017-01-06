package com.crpoon.leetcode.easy;

public class RemoveElement_27 {
	public int removeElement(int[] nums, int val) {
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (nums[i] == val) {
                nums[i--] = nums[l-- - 1];
            }
        }
        return l;
    }
}
