package com.crpoon.leetcode.medium;

import java.util.PriorityQueue;

public class KthLargestElementInArray_215 {
	public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(k + 1);
        for (int i : nums) {
            heap.add(i);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        return heap.poll();
    }
}
