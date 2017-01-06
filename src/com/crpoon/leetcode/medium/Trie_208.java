package com.crpoon.leetcode.medium;

import com.crpoon.leetcode.TrieNode;
	public class Trie_208 {
	    private TrieNode root;

	    public Trie_208() {
	        root = new TrieNode();
	    }

	    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode current = root;
        for (Character c : word.toCharArray()) {
            int index = c - 'a';
            if (current.characters[index] == null) {
                current.characters[index] = new TrieNode();
            }
            current = current.characters[index];
        }
        current.isWord = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node = find(word);
        if (node == null) {
            return false;
        }
        return node.isWord;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode node = find(prefix);
        if (node == null) {
            return false;
        }
        return true;
    }
    
    private TrieNode find(String word) {
        if (word == null) {
            return null;
        }
        TrieNode current = root;
        for (Character c : word.toCharArray()) {
            int index = c - 'a';
            if (current.characters[index] == null) {
                return null;
            }
            current = current.characters[index];
        }
        return current;
    }
}
