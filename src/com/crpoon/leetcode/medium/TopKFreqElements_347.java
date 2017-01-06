package com.crpoon.leetcode.medium;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFreqElements_347 {
	public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
           public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
               return b.getValue() - a.getValue();
           }
        });
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.add(entry);
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            Map.Entry<Integer, Integer> entry = heap.poll();
            list.add(entry.getKey());
        }
        return list;
    }
}
