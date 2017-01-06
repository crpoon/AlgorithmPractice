package com.crpoon.leetcode.easy;

public class CountPrimes_204 {
	public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        boolean[] notPrimes = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!notPrimes[i]) {
                count++;
                for (int j = 1; (i * j) < n; j++) {
                    notPrimes[i*j] = true;
                }
            }
        }
        return count;
    }
}
