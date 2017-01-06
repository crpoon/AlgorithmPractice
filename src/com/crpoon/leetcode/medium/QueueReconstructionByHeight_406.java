package com.crpoon.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QueueReconstructionByHeight_406 {
	public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] p1, int[] p2) {
                return (p1[0] == p2[0] ? p1[1] - p2[1] : p2[0] - p1[0]);
            }
            
        });
        
        List<int[]> result = new ArrayList<>();
        for (int[] current : people) {
            if (current[1] >= result.size()) {
                result.add(current);
            } else {
                result.add(current[1],current);
            }
        }
        return result.toArray(new int[people.length][]);
    }
}
