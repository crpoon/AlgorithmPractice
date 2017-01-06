package com.crpoon.leetcode.easy;

public class ClimbingStairs_70 {
	public int climbStairs(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        // F(0) = F(1) + F(2) where F(1) = n - 1, F(2) = n - 2, F(0) = n
        int f0 = 0;
        int f1 = 2;
        int f2 = 1;
        
        for (int i = 2; i < n; i++) {
            f0 = f1 + f2;
            f2 = f1;
            f1 = f0;
        }
        return f0;
    }
}
