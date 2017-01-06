package com.crpoon.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
	public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int i : nums) {
            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i) + 1);
            } else {
                freq.put(i, 1);
            }
        }
        
        for (Integer i : freq.keySet()) {
            if (freq.get(i) > nums.length / 2) {
                return i;
            }
        }
        return 0;
    }
}
