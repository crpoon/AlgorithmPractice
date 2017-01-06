package com.crpoon.leetcode.hard;

public class TrappingRainWater_42 {
	public int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        
        int level = 0;
        int result = 0;
        
        while (i <= j) {
            level = Math.max(Math.min(height[i], height[j]), level);
            
            if (height[i] >= height[j]) {
                result += level - height[j];
                j--;
            } else {
                result += level - height[i];
                i++;
            }
        }
        return result;
    }
}
