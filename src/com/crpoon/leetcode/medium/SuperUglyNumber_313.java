package com.crpoon.leetcode.medium;

import java.util.Arrays;

public class SuperUglyNumber_313 {
	public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        int[] index = new int[primes.length];
        int[] values = new int[primes.length];
        Arrays.fill(values, 1);
        
        int next = 1;
        for (int i = 0; i < n; i++) {
            ugly[i] = next;
            next = Integer.MAX_VALUE;
            
            for (int j = 0; j < primes.length; j++) {
                if (values[j] == ugly[i]) {
                    values[j] = primes[j] * ugly[index[j]++];
                }
                next = Math.min(next, values[j]);
            }
        }
        return ugly[n-1];
    }
}
