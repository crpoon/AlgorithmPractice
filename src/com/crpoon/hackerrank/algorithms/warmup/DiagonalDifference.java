package com.crpoon.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        int prim = 0;
        int sec = 0;
        for (int i = 0; i < n; i++) {
            prim += a[i][i];
            sec += a[i][n-i-1];
        }
        
        System.out.println((int) Math.abs((double) prim - sec));
    }
}
