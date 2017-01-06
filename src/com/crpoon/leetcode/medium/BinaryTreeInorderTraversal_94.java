package com.crpoon.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.crpoon.leetcode.TreeNode;

public class BinaryTreeInorderTraversal_94 {
	public List<Integer> inorderTraversal(TreeNode root) {
        // inorder = left, root, right
        return isValid(root);
    }
    
    public List<Integer> isValid(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        LinkedList<TreeNode> nodesStack = new LinkedList<>();
        
        while (root != null || !nodesStack.isEmpty()) {
            while (root != null) {
                nodesStack.push(root);
                root = root.left;
            }
            root = nodesStack.pop();
            ret.add(root.val);
            root = root.right;
        }
        return ret;
    }
}
