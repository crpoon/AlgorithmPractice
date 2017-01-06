package com.crpoon.hackerrank.algorithms.graphtheory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FloydWarshallAlgorithm {
	static class Edge {
        int src;
        int dest;
        int weight;
        
        Edge (int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int e = in.nextInt();
        
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < e; i++) {
            in.nextLine();
            edges.add(new Edge(in.nextInt(), in.nextInt(), in.nextInt()));
        }
        
        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    dist[i][j] = 0;
                } else {
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        
        for (Edge edge : edges) {
            dist[edge.src - 1][edge.dest - 1] = edge.weight;
        }
        
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE) {
                        if (dist[i][j] > dist[i][k] + dist[k][j]) {
                            dist[i][j] = dist[i][k] + dist[k][j];
                        }
                    }
                }
            }
        }
                      
        // Pairs of paths
        in.nextLine();
        int pairs = in.nextInt();     
        for (int i = 0; i < pairs; i++) {
            in.nextLine();
            int distance = dist[in.nextInt() - 1][in.nextInt() - 1];
            System.out.println(distance == Integer.MAX_VALUE ? -1 : distance);
        }
    }
}
