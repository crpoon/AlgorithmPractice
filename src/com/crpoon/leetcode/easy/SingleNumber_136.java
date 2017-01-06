package com.crpoon.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber_136 {
	public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            map.put(num, map.containsKey(num) ? 2 : 1);
        }
        
        for (Integer num : map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        
        return 0;
    }
}
