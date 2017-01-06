package com.crpoon.leetcode.easy;

public class RotateFunction_396 {
	public int maxRotateFunction(int[] A) {
        int F = 0;
        int sum = 0;
        
        for (int i = 0; i < A.length; i++) {
            F += i * A[i];
            sum += A[i];
        }
        int max = F;
        for (int i = A.length - 1; i >= 1; i--) {
            F = F + sum - (A.length * A[i]);
            max = Math.max(F, max);
        }
        return max;
    }
}
