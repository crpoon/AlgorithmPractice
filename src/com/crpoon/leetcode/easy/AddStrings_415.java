package com.crpoon.leetcode.easy;

public class AddStrings_415 {
	public String addStrings(String num1, String num2) {
        String longer = num1.length() > num2.length() ? num1 : num2;
        String shorter = num1.length() > num2.length() ? num2 : num1;
        
        StringBuilder sb = new StringBuilder();
        boolean carry = false;
        for (int i = shorter.length() - 1; i >= 0; i--) {
            int a = shorter.charAt(i) - '0';
            int b = longer.charAt(i + (longer.length() - shorter.length())) - '0';
            int result = a + b + (carry ? 1 : 0);
            
            if (result >= 10) {
                carry = true;
            } else {
                carry = false;
            }
            sb.insert(0, result % 10);
        }
        
        for (int i = (longer.length() - shorter.length() - 1); i >= 0 ; i--) {
            int result = longer.charAt(i) - '0' + (carry ? 1 : 0);
            if (result >= 10) {
                carry = true;
            } else {
                carry = false;
            }
            sb.insert(0, result % 10);
        }
        
        if (carry) {
            sb.insert(0, '1');
        }
        return sb.toString();
    }
}
