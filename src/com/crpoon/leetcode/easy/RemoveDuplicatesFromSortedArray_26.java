package com.crpoon.leetcode.easy;

public class RemoveDuplicatesFromSortedArray_26 {
	public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        
        int i = 0;
        int j = 1;
        
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }
}
