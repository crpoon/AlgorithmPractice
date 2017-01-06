package com.crpoon.leetcode.medium;

public class SortColors_75 {
	public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        for (int i = 0; i <= end; i++) { 
            while (nums[i] == 2 && i < end) {
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }
            while (nums[i] == 0 && i > start) {
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
            }
        }
    }
}
