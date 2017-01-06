package com.crpoon.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BiggerIsGreater {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            biggerIsGreater(s);
        }
    }
    
    public static void biggerIsGreater(String s) {
        if (s.length() < 2) {
            System.out.println("no answer");
            return;
        }
        
        char[] charArr = s.toCharArray();
        // Find smaller than previous
        int smallerThanPrevInd = -1;

        for (int i = charArr.length - 1; i >= 1; i--) {
            if (charArr[i - 1] < charArr[i]) {
                smallerThanPrevInd = i - 1;
                break;
            }
        }
        
        if (smallerThanPrevInd < 0) {
            System.out.println("no answer");
            return;
        }
        
        // Find larger element
        int nextLargerElement = -1;
        for (int i = charArr.length - 1; i >= 0; i--) {
            if (charArr[i] > charArr[smallerThanPrevInd]) {
                nextLargerElement = i;
                break;
            }
        }
        
        if (nextLargerElement < 0) {
            System.out.println("no answer");
            return;
        }
        
        char temp = charArr[smallerThanPrevInd];
        charArr[smallerThanPrevInd] = charArr[nextLargerElement];
        charArr[nextLargerElement] = temp;
        
        // Reverse from larger element to length - 1
        if (smallerThanPrevInd < charArr.length - 1) {
            reverse(charArr, smallerThanPrevInd + 1, charArr.length - 1);
        }
        System.out.println(String.valueOf(charArr));
    }
    
    public static void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}
