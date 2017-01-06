package com.crpoon.hackerrank.algorithms.search;

import java.util.Scanner;

public class SherlockAndArray {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            in.nextLine();
            int[] arr = new int[m];
            for (int j = 0; j < m; j++) {
                arr[j] = in.nextInt();
            }
            System.out.println(sherlock(arr));
            if (in.hasNextLine()) {
                in.nextLine();
            }
        }
    }
    
    public static String sherlock(int[] arr) {
        if (arr.length == 1) {
           return "YES"; 
        } else if (arr.length == 2) {
            if (arr[0] == 0 || arr[1] == 0) {
                return "YES";
            } else {
                return "NO";
            }
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        
        int leftSum = 0;
        int index = 0;
        while (index < arr.length - 1) {
            int rightSum = total - arr[index] - leftSum;
            if (rightSum == leftSum) {
                return "YES";
            }
            leftSum += arr[index];
            index++;
        }
        return "NO";
    }
}
