package com.crpoon.leetcode.easy;

import com.crpoon.leetcode.ListNode;

public class SwapNodesInPairs_24 {
	public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while (curr.next != null && curr.next.next != null) {
            ListNode first = curr.next;
            ListNode second = curr.next.next;
            first.next = second.next;
            curr.next = second;
            curr.next.next = first;
            curr = curr.next.next;
        }
        return dummy.next;
    }
}
