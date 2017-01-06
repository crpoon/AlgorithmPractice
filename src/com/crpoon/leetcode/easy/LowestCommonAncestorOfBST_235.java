package com.crpoon.leetcode.easy;

import com.crpoon.leetcode.TreeNode;

public class LowestCommonAncestorOfBST_235 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while ((root.val - p.val) * (root.val - q.val) > 0) {
            root = p.val > root.val ? root.right : root.left;
        }
        return root;
    }
}
