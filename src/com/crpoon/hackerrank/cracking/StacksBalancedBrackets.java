package com.crpoon.hackerrank.cracking;

import java.util.Scanner;
import java.util.Stack;

public class StacksBalancedBrackets {
	public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        if ((expression.length() & 1) == 1) {
            return false;
        }
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '{') {
                stack.push('}');
            } else if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else {
                if (stack.isEmpty() || c != stack.peek()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
