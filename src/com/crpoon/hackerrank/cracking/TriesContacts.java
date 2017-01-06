package com.crpoon.hackerrank.cracking;

import java.util.Scanner;

public class TriesContacts {
	static class Node {
        int val = 0;
        Node[] children = new Node[26];
    };
    
    static Node[] tree = new Node[26];
    
    public static void performOp(String op, String contact) {
        if (op.equals("add")) {
            addContact(contact);
        } else if (op.equals("find")) {
            System.out.println(findContact(contact));
        }
    }
    
    public static void addContact(String contact) {
        if (contact == null || contact.isEmpty()) {
            return;
        }
        Node[] node = tree;
        for (int i = 0; i < contact.length(); i++) {
            int childIndex = contact.charAt(i) - 'a';
            if (node[childIndex] == null) {
                node[childIndex] = new Node();
            }
            node[childIndex].val++;
            node = node[childIndex].children;
        }
    }
    
    public static int findContact(String contact) {
        if (contact == null || contact.isEmpty()) {
            return 0;
        }
        Node[] node = tree;
        int ret = 0;
        for (int i = 0; i < contact.length(); i++) {
            int childIndex = contact.charAt(i) - 'a';
            if (node[childIndex] == null) {
                return 0;
            }
            ret = node[childIndex].val;
            node = node[childIndex].children;
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            performOp(op, contact);
        }
    }
}
