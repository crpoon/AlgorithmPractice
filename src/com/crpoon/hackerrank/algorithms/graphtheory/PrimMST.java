package com.crpoon.hackerrank.algorithms.graphtheory;

import java.util.Scanner;

public class PrimMST {
	public static int min(int n, int[] dist, boolean[] inTree) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (dist[i] < min && !inTree[i]) {
                min = dist[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int e = in.nextInt();
        in.nextLine();
        
        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                graph[i][j] = -1;
            }
        }
        for (int i = 0; i < e; i++) {
            int src = in.nextInt();
            int dest = in.nextInt();
            int weight = in.nextInt();
            graph[src - 1][dest - 1] = weight;
            graph[dest - 1][src - 1] = weight;
            in.nextLine();
        }
        
        int seed = in.nextInt() - 1;
        long sum = 0;
        
        boolean[] inTree = new boolean[n];
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[seed] = 0;
        
        for (int i = 0; i < n; i++) {
            int next = min(n, dist, inTree);
            inTree[next] = true;
            sum += dist[next];
            
            for (int j = 0; j < n; j++) {
                int val = graph[next][j];
                if (val != -1 && !inTree[j] &&
                   val < dist[j]) {
                    dist[j] = val;
                }
            }
        }
        
        System.out.println(sum);
    }
}
