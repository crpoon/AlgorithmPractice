package com.crpoon.hackerrank.algorithms.search;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MissingNumbers {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        in.nextLine();
        int m = in.nextInt();
        in.nextLine();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }
        
        Map<Integer, Integer> map = new TreeMap<>();
        
        for (int i = 0; i < m; i++) {
            if (map.containsKey(b[i])) {
                map.put(b[i], map.get(b[i]) + 1);
            } else {
                map.put(b[i], 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) - 1);
            } else {
                map.put(a[i], 1);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (Integer i : map.keySet()) {
            int freq = map.get(i);
            if (freq > 0) {
                sb.append(i + " ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}
