package com.crpoon.leetcode.easy;

public class PlusOne_66 {
	public int[] plusOne(int[] digits) {
        boolean carry = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            int result = digits[i] + ((carry || i == digits.length - 1) ? 1 : 0);
            if (result > 9) {
                carry = true;
            } else {
                carry = false;
            }
            digits[i] = result % 10;
        }
        if (carry) {
            int[] resultArr = new int[digits.length + 1];
            resultArr[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                resultArr[i+1] = digits[i];
            }
            return resultArr;
        }
        return digits;
    }
}
