package com.crpoon.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class TwoSumII_167 {
	public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        if (numbers == null || numbers.length < 2) {
            return ret;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }
        
        for (int i = 0; i < numbers.length; i++) {
            Integer j = map.get(target - numbers[i]);
            if (j != null) {
                return new int[]{i + 1,j + 1};
            }
        }
        return ret;
    }
}
