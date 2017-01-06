package com.crpoon.leetcode.medium;

public class Sqrt_69 {
	public int mySqrt(int x) {
        if (x <= 0) {
            return 0;
        } else if (x < 4) {
            return 1;
        }
        
        int lo = 1;
        int hi = x;
        int ans = 0;
        while (lo < hi) {
            int mid = (hi + lo) / 2;
            if (mid > (x/mid)) {
                hi = mid;
            } else {
                ans = mid;
                lo = mid + 1;
            }
            
        }
        return ans;
    }
}
