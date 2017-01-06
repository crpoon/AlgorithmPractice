package com.crpoon.leetcode.easy;

public class AddDigits_258 {
	public int addDigits(int num) {
        return num<10? num: (num%9==0? 9: num%9);
    }
}
