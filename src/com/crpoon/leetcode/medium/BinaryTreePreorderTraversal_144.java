package com.crpoon.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.crpoon.leetcode.TreeNode;

public class BinaryTreePreorderTraversal_144 {
	public List<Integer> preorderTraversal(TreeNode root) {
        // preorder = root, left, right
        return isValid(root);
    }
    
    public List<Integer> isValid(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) {
            return ret;
        }
        LinkedList<TreeNode> nodesStack = new LinkedList<>();
        nodesStack.push(root);
        
        while (!nodesStack.isEmpty()) {
            root = nodesStack.pop();
            
            ret.add(root.val);
            if (root.right != null) {
                nodesStack.push(root.right);
            }
            if (root.left != null) {
                nodesStack.push(root.left);
            }
        }
        return ret;
    }
}
