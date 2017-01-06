package com.crpoon.leetcode.easy;

import com.crpoon.leetcode.TreeNode;

public class InvertBinaryTree_226 {
	public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }
        return null;
    }
}
