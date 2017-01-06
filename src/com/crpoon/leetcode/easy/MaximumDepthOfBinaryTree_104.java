package com.crpoon.leetcode.easy;

import com.crpoon.leetcode.TreeNode;

public class MaximumDepthOfBinaryTree_104 {

	public int maxDepth(TreeNode root) {
        if (root != null) {
            return recMaxDepth(root, 1);
        } else {
            return 0;
        }
    }
    
    public int recMaxDepth(TreeNode node, int depth) {
        int left = 0;
        int right = 0;
        if (node.left != null) {
            left = recMaxDepth(node.left, depth + 1);
        }
        if (node.right != null) {
            right = recMaxDepth(node.right, depth + 1);
        }
        return Math.max(depth, Math.max(left, right));
    }
}
