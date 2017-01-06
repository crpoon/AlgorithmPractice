package com.crpoon.leetcode.medium;

import java.util.Random;

import com.crpoon.leetcode.ListNode;

public class LinkedListRandomNode_382 {
	ListNode head = null;
    Random rng = null;
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public LinkedListRandomNode_382(ListNode head) {
        this.head = head;
        rng = new Random();
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        ListNode result = null;
        ListNode curr = head;
        for (int i = 1; curr != null; i++) {
            if (rng.nextInt(i) == 0) {
                result = curr;
            }
            curr = curr.next;
        }
        return result.val;
    }
}
