package com.crpoon.leetcode.medium;

public class FindPeakElement_162 {
	 public int findPeakElement(int[] nums) {
	        if (nums == null || nums.length == 0) {
	            return -1;
	        }
	        
	        // num[i-1] < num[i] < num[i+1] i+1 onwards has peak
	        // num[i-1] > num[i] > num[i+1] i-1 backwards has peak
	        // num[i-1] < num[i] > num[i+1] i is peak
	        // num[i-1] > num[i] < num[i+1] peak on either side
	        
	        return bSearch(nums, 0, nums.length-1);
	    }
	    
	    public int bSearch(int[] nums, int lo, int hi) {
	        if (lo == hi) {
	            return lo;
	        } else if (lo + 1 == hi) {
	            if (nums[lo] > nums[hi]) {
	                return lo;
	            } 
	            return hi;
	        } else {
	            int mid = (lo + hi) / 2;
	            
	            if (nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) {
	                return mid;
	            } else if (nums[mid] < nums[mid-1] && nums[mid] > nums[mid+1]) {
	                return bSearch(nums, lo, mid-1);
	            } else {
	                return bSearch(nums, mid+1, hi);
	            }
	        }
	    }
}
