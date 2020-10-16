package com.leetcode.linkedlist;

/**
 * @author Chayanika Ghosh
 */
public class Node {
    int data;
    Node next;
    Node(int d){
        data = d;
    }
    Node(int d, Node next){
        data = d;
        next = null;
    }
}
