package com.crpoon.leetcode;

public class TrieNode {
    
    public TrieNode characters[];
    public boolean isWord;
    
    public TrieNode() {
        characters = new TrieNode[26];
    }
}
