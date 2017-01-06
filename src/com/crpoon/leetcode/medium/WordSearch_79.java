package com.crpoon.leetcode.medium;

public class WordSearch_79 {
	public boolean exist(char[][] board, String word) {
        if (word == null || word.isEmpty()) {
            return true;
        }
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (exists(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean exists(char[][] board, String word, int x, int y, int i) {
        if (i == word.length()) return true;
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length) return false;
        if (board[x][y] != word.charAt(i)) return false;
        board[x][y] ^= 256;
        boolean exists = exists(board, word, x-1, y, i+1) ||
            exists(board, word, x+1, y, i+1) ||
            exists(board, word, x, y-1, i+1) ||
            exists(board, word, x, y+1, i+1);
        board[x][y] ^= 256;
        return exists;
    }
}
