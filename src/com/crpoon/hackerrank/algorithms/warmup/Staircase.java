package com.crpoon.hackerrank.algorithms.warmup;

import java.util.Scanner;

public class Staircase {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = n-i-1; j >=0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.print('\n');
        }
    }
}
