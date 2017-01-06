package com.crpoon.leetcode.medium;

import java.util.Random;

public class ShuffleAnArray_384 {
	int[] nums = null;
    Random rng;
    
    public ShuffleAnArray_384(int[] nums) {
        this.nums = nums;
        this.rng = new Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if (nums == null) return null;
        int[] newArr = nums.clone();
        for (int i = 1; i < nums.length; i++) {
            int random = rng.nextInt(i + 1);
            int temp = newArr[i];
            newArr[i] = newArr[random];
            newArr[random] = temp;
        }
        return newArr;
    }
}
