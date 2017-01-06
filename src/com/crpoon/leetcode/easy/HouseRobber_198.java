package com.crpoon.leetcode.easy;

public class HouseRobber_198 {
	public int rob(int[] nums) {
        int prevYes = 0;
        int prevNo = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = prevNo + nums[i];
            prevNo = Math.max(prevNo, prevYes);
            prevYes = temp;
        }
        return Math.max(prevNo, prevYes);
    }
}
