package com.crpoon.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII_350 {
	 // If they were sorted, then we could go through one of the lists and increment until you found a match
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : nums1) {
            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i) + 1);
            } else {
                freq.put(i, 1);
            }
        }
        
        List<Integer> intersect = new ArrayList<>();
        for (int i : nums2) {
            if (freq.containsKey(i)) {
                intersect.add(i);
                int count = freq.get(i);
                if (count <= 1) {
                    freq.remove(i);
                } else {
                    freq.put(i, freq.get(i) - 1);
                }
            }
        }
        
        int[] array = new int[intersect.size()];
        int idx = 0;
        for (Integer i : intersect) {
            array[idx++] = i;
        }
        return array;
    }
    
}