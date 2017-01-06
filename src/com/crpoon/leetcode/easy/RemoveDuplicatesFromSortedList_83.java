package com.crpoon.leetcode.easy;

import com.crpoon.leetcode.ListNode;

public class RemoveDuplicatesFromSortedList_83 {
	public ListNode deleteDuplicates(ListNode head) {
        ListNode currNode = head;
        while (currNode != null) {
            if (currNode.next == null) {
                break;
            }
            if (currNode.val == currNode.next.val) {
                currNode.next = currNode.next.next;
            } else {
                currNode = currNode.next;
            }
        }
        return head;
    }
}
