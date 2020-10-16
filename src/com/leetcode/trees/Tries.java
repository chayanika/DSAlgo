package com.leetcode.trees;

import java.util.ArrayList;

/**
 * @author Chayanika Ghosh
 */
public class Tries {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("pqrs");
        list.add("pprt");
        list.add("psst");
        list.add("qqrs");
        list.add("pqrs");
        final Trie trie = new Trie();
        list.forEach(trie::insert);
        System.out.println(trie.query("psst"));
        System.out.println(trie.query("psstq"));
        trie.update("psst", "pqrs");
        System.out.println(trie.query("pqrs"));
        System.out.println(trie.query("psst"));

    }

}
