package com.crpoon.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate_217 {
	public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            if (map.containsKey(num)) {
                return true;
            } else {
                map.put(num, 1);
            }
        }
        return false;
    }
}
