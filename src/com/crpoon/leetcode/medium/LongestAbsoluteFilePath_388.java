package com.crpoon.leetcode.medium;

import java.util.LinkedList;

public class LongestAbsoluteFilePath_388 {
	public int lengthLongestPath(String input) {
        LinkedList<Integer> lenStk = new LinkedList<>();
        lenStk.push(0);
        int maxLen = 0;
        for (String s : input.split("\n")) {
            int level = s.lastIndexOf("\t") + 1;
            while (level + 1 < lenStk.size()) {
                lenStk.pop();
            }
            int length = lenStk.peek() + s.length() - level + 1;
            lenStk.push(length);
            if (s.contains(".")) {
                maxLen = Math.max(length - 1, maxLen);
            }
        }
        return maxLen;
    }
}
