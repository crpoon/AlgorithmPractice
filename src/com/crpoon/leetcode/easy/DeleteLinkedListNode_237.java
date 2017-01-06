package com.crpoon.leetcode.easy;

import com.crpoon.leetcode.ListNode;

public class DeleteLinkedListNode_237 {
	public void deleteNode(ListNode node) {
        if (node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
