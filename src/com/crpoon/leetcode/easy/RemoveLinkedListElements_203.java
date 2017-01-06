package com.crpoon.leetcode.easy;

import com.crpoon.leetcode.ListNode;

public class RemoveLinkedListElements_203 {
	public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            if (current.val == val) {
                if (current.next != null) {
                    current.val = current.next.val;
                    current.next = current.next.next;
                } else {
                    if (prev == null) {
                        return null;
                    }
                    prev.next = null;
                    break;
                }
            } else {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }
}
