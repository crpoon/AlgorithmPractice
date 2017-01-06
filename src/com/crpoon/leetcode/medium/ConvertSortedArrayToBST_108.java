package com.crpoon.leetcode.medium;

import com.crpoon.leetcode.TreeNode;

public class ConvertSortedArrayToBST_108 {
	public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length < 1) {
            return null;
        }
        return buildTree(nums, 0, nums.length - 1);
    }
    
    public TreeNode buildTree(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        int mid = (lo + hi) / 2;
        TreeNode thisNode = new TreeNode(nums[mid]);
        thisNode.left = buildTree(nums, lo, mid-1);
        thisNode.right = buildTree(nums, mid+1, hi);
        return thisNode;
    }
}
