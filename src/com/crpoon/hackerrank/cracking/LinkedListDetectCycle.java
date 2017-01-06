package com.crpoon.hackerrank.cracking;

import com.crpoon.hackerrank.Node;

public class LinkedListDetectCycle {
	boolean hasCycle(Node head) {
	    if (head == null || head.next == null) {
	        return false;
	    }
	    
	    Node slow = head.next;
	    Node fast = head.next.next;
	    
	    while (fast != null && fast.next != null) {
	        if (slow == fast) {
	            return true;
	        }
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	    
	    return false;
	}
}
