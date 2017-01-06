package com.crpoon.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        int pos = 0, neg = 0, zer = 0;
        for (Integer i : arr) {
            if (i < 0) {
                neg++;
            } else if (i > 0) {
                pos++;
            } else {
                zer++;
            }
        }
        System.out.println((double) pos / n);
        System.out.println((double) neg / n);
        System.out.println((double) zer / n);
    }
}
