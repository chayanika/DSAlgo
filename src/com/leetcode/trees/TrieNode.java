package com.leetcode.trees;

/**
 * @author Chayanika Ghosh
 */
public class TrieNode {
    int terminating;
    TrieNode [] trieNodes = new TrieNode[26];

    public TrieNode next(final char c){
        return trieNodes[c - 'a'];
    }
}




