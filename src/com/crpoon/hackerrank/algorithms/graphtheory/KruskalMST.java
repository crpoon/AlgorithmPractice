package com.crpoon.hackerrank.algorithms.graphtheory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KruskalMST {
	static class Edge {
        int src;
        int dest;
        int weight;
        
        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    
    static class Node {
        int val;
        int parent;
        int rank;
        
        Node(int val, int parent, int rank) {
            this.val = val;
            this.parent = parent;
            this.rank = rank;
        }
    }
        
    static PriorityQueue<Edge> queue = new PriorityQueue<Edge>(10, new Comparator<Edge>() {
        public int compare(Edge e1, Edge e2) {
            return e1.weight - e2.weight;
        }
    });
        
    static List<Node> nodes = new ArrayList<Node>();
    
    public static void union(Node x, Node y) {
        Node n1 = find(x);
        Node n2 = find(y);
        
        // Same parents
        if (n1.val == n2.val) {
            return;
        }
        
        if (n1.rank < n2.rank) {
            n1.parent = n2.parent;
        } else if (n2.rank > n1.rank) {
            n2.parent = n1.parent;
        } else {
            n2.parent = n1.parent;
            n1.rank += 1;
        }
    }
    
    public static Node find(Node x) {
        if (x.val != x.parent) {
            return find(nodes.get(x.parent - 1));
        }
        return nodes.get(x.parent - 1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int e = in.nextInt();
        
        for (int i = 0; i < e; i++) {
            queue.add(new Edge(in.nextInt(), in.nextInt(), in.nextInt()));
            if (in.hasNextLine()) {
                in.nextLine();
            }
        }
        
        for (int i = 1; i <= v; i++) {
            nodes.add(new Node(i, i, 0));
        }
        
        List<Edge> result = new ArrayList<>();
        
        while (queue.size() > 0) {
            Edge minEdge = queue.poll();
            
            Node x = find(nodes.get(minEdge.src - 1));
            Node y = find(nodes.get(minEdge.dest - 1));
            
            if (x.val != y.val) {
                result.add(minEdge);
                union(x, y);
            }
        }
        
        int sum = 0;
        for (Edge ed : result) {
            sum += ed.weight;
        }
        System.out.println(sum);
    }
}
