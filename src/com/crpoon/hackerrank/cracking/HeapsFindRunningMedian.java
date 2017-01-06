package com.crpoon.hackerrank.cracking;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HeapsFindRunningMedian {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        PriorityQueue<Integer> smaller = new PriorityQueue<Integer>(10000, new Comparator<Integer>(){
            
            public int compare (Integer i1, Integer i2) {
                return i2 - i1;
            }
        });
        PriorityQueue<Integer> larger = new PriorityQueue<Integer>();
        
        for (int i : a) {
            if (smaller.isEmpty()) {
                smaller.add(i);
            } else {
                if (smaller.size() > larger.size()) {
                    if (smaller.peek() > i) {
                        larger.add(smaller.poll());
                        smaller.add(i);
                    } else {
                        larger.add(i);
                    }
                } else {
                    Integer j = larger.peek();
                    if (j != null && j >= i) {
                        smaller.add(i);
                    } else {
                        smaller.add(larger.poll());
                        larger.add(i);
                    }
                }
            }
            
            int size = smaller.size() + larger.size();
            double median;
            if (size % 2 == 0) {
                median = (smaller.peek() + larger.peek()) / 2.0d;
            } else {
                median = smaller.peek();
            }
            System.out.println(median);
        }
    }
}
