package com.crpoon.leetcode.easy;

public class NimGame_292 {
	public boolean canWinNim(int n) {
        if (n == 1 || n == 2 || n == 3) return true;
        

        if (n % 2 == 0) {
            int temp = n / 2;
            if (temp % 2 == 0) {
                return false;
            } else {
                return true;
            }
        }
        
        if (n % 3 == 0) {
            int temp = n / 3;
            if (temp % 2 == 0) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}
