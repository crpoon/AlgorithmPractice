package com.crpoon.leetcode.easy;

import com.crpoon.leetcode.ListNode;

public class ReverseLinkedList_206 {
	public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        ListNode next = null;
        // next = actual next
        // head.next = new next
        // newHead = node you are at
        // move to next node in the list
        while (head != null) {
            next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
