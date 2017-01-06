package com.crpoon.hackerrank.algorithms.search;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pairs {
	static int pairs(int[] a,int k) {
	      /* Complete this function */
	        Set<Integer> hash = new HashSet<>();
	        for (int i = 0; i < a.length; i++) {
	            hash.add(a[i]);
	        }
	        
	        int pairs = 0;
	        for (int i = 0; i < a.length; i++) {
	            if (hash.contains(a[i] - k)) {
	                pairs++;
	            }
	        }
	        
	        return pairs;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int res;
	        
	        String n = in.nextLine();
	        String[] n_split = n.split(" ");
	        
	        int _a_size = Integer.parseInt(n_split[0]);
	        int _k = Integer.parseInt(n_split[1]);
	        
	        int[] _a = new int[_a_size];
	        int _a_item;
	        String next = in.nextLine();
	        String[] next_split = next.split(" ");
	        
	        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
	            _a_item = Integer.parseInt(next_split[_a_i]);
	            _a[_a_i] = _a_item;
	        }
	        
	        res = pairs(_a,_k);
	        System.out.println(res);
	    }
}
