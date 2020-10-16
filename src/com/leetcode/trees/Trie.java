package com.leetcode.trees;

/**
 * @author Chayanika Ghosh
 */
public class Trie {
    final TrieNode root;
    public Trie(){
        this.root = new TrieNode();
    }

    public int query(String S){
        TrieNode current = root;
        for(int i =0;i<S.length();i++){
        if(current == null || current.next(S.charAt(i))== null){
            return 0;
        }else{
            current = current.next(S.charAt(i));
        }
        }
        return current.terminating;
    }

    public int insert(String S){
        TrieNode current = root;
        for(int i=0;i<S.length(); i++){
            if(current.trieNodes[S.charAt(i) - 'a']== null){
                current.trieNodes[S.charAt(i)- 'a'] = new TrieNode();
            }
            current = current.next(S.charAt(i));
        }return current.terminating ++;
    }

    public void delete(final String s) {
        TrieNode current = root;
        for (int i = 0; i < s.length(); i++) {
            if (current == null) {
                throw new RuntimeException();
            }
            current = current.next(s.charAt(i));
        }
        if (current.terminating != 0) {
            current.terminating--;
        } else {
            throw new RuntimeException();
        }
    }

    public void update(String old, String newString){
        if(old!= null){
           delete(old);
           insert(newString);
        }
    }
}
