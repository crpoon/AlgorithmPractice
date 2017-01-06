package com.crpoon.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class AVeryBigSum {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        long sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }
}
