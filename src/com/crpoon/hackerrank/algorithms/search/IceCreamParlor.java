package com.crpoon.hackerrank.algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class IceCreamParlor {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            in.nextLine();
            int m = in.nextInt();
            in.nextLine();
            int n = in.nextInt();
            in.nextLine();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }
            System.out.println(icecream(arr, m));
        }
    }
    
    public static String icecream(int[] arr, int m) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int sum = sorted[i] + sorted[j];
            if (sum == m) {
                break;
            } else if (sum < m) {
                i++;
            } else {
                j--;
            }
        }
        int a = -1;
        int b = -1;
        for (int n = 0; n < arr.length; n++) {
            if (a == -1 && sorted[i] == arr[n]) {
                a = n;
            } else if (b == -1 && sorted[j] == arr[n]) {
                b = n;
            }
        }
        if (a > b) {
            return (b+1) + " " + (a+1);
        } else {
            return (a+1) + " " + (b+1);
        }
    }
}
