package com.crpoon.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

import com.crpoon.leetcode.TreeNode;

public class KthSmallestElementInBST_230 {
	public int kthSmallest(TreeNode root, int k) {
        List<TreeNode> inOrderList = inOrderTraversal(root);
        
        return inOrderList.get(k - 1).val;
    }
    
    public List<TreeNode> inOrderTraversal(TreeNode node) {
        List<TreeNode> list = new ArrayList<>();
        if (node == null) {
            return list;
        }
        
        list.addAll(inOrderTraversal(node.left));
        list.add(node);
        list.addAll(inOrderTraversal(node.right));
        return list;
    }
}
