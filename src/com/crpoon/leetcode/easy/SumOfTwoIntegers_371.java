package com.crpoon.leetcode.easy;

public class SumOfTwoIntegers_371 {
	public int getSum(int a, int b) {
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                a++;
            }
        } else {
            for (int i = 0; i > b; i--) {
                a--;
            }
        }
        return a;
    }
}
