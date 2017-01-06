package com.crpoon.leetcode.easy;

public class PalindromeNumber_9 {
	public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int rev = 0;
        while (temp > 0) {
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
        }
        return x == rev;
    }
}
