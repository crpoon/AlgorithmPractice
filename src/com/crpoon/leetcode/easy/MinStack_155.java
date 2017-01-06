package com.crpoon.leetcode.easy;

import java.util.Stack;

public class MinStack_155 {
	class Element {
        int value;
        int min;
        Element (int value, int min) {
            this.value = value;
            this.min = min;
        }
    }
    
    Stack<Element> stack;
    
    /** initialize your data structure here. */
    public MinStack_155() {
        this.stack = new Stack<Element>();
    }
    
    public void push(int x) {
        int min = stack.isEmpty() ? x : Math.min(getMin(), x); 
        stack.push(new Element(x, min));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().value;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
