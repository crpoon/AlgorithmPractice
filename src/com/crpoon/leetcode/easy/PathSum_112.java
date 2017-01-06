package com.crpoon.leetcode.easy;

import com.crpoon.leetcode.TreeNode;

public class PathSum_112 {
	public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum == root.val;
        }
        sum -= root.val;
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}
