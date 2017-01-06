package com.crpoon.hackerrank.cracking;

import com.crpoon.hackerrank.Node;

public class TreesIsBST {
	boolean checkBST(Node root) {
        if (root == null) {
            return false;
        }
        
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean checkBST(Node node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.data <= min || node.data >= max) {
            return false;
        }
        
        return checkBST(node.left, min, node.data) && checkBST(node.right, node.data, max);
    }
}
