package com.crpoon.leetcode.medium;

public class SingleNumberIII_260 {
	public int[] singleNumber(int[] nums) {
        int diff = 0;
        for (int i : nums) {
            diff ^= i;
        }
        
        diff &= -diff;
        
        int[] ret = new int[2];
        for (int i : nums) {
            if ((diff & i) == 0) {
                ret[0] ^= i;
            } else {
                ret[1] ^= i;
            }
        }
        return ret;
    }
}
