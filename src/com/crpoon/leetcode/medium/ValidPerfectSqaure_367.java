package com.crpoon.leetcode.medium;

public class ValidPerfectSqaure_367 {
	public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        
        int lo = 0;
        int hi = num;
        while (lo <= hi) {
            int mid = (lo + hi) >>> 1;
            long midSq = (long) mid * (long) mid;
            if (midSq == (long) num) {
                return true;
            } else if (midSq < (long) num) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
    }
}
