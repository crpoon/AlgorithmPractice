package com.crpoon.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays_349 {
	public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        
        for (int i : nums1) {
            set.add(i);
        }
        
        Set<Integer> returnSet = new HashSet<>();
        for (int i : nums2) {
            if (set.contains(i)) {
                returnSet.add(i);
            }
        }
        int[] array = new int[returnSet.size()];
        int idx = 0;
        for (int i : returnSet) {
            array[idx++] = i;
        }
        return array;
    }
}
