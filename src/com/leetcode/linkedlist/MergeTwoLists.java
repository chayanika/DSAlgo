package com.leetcode.linkedlist;

import java.util.LinkedList;

/**
 * @author Chayanika Ghosh
 */
public class MergeTwoLists {
    public Node mergelist(Node head1,Node head2){
        Node dummyNode = new Node(0);
        Node head3 = dummyNode;
        while(true) {
        if(head1 == null ){
            head3.next = head2;
            break;
        }
        if(head2==null){
            head3.next = head1;
            break;
        }

            if (head1.data <= head2.data) {
                head3.next = head1;
                head1 = head1.next;
            } else if(head2.data<head1.data) {
                head3.next = head2;
                head2 = head2.next;
            }
            head3 = head3.next;
        }
        return dummyNode.next;
    }
    public void printList(Node list3){
        while(list3!=null){
            System.out.println(list3.data);
            list3= list3.next;
        }
    }

    public static void main(String[] args) {
//        LinkedList<Integer> list1 = new LinkedList<>();
//        LinkedList<Integer> list2 = new LinkedList<>();
//
//        list1.add(5);
//        list1.add(10);
//        list1.add(15);
//        list2.add(2);
//        list2.add(3);
//        list2.add(20);
        Node list1;
        Node list2;
        Node head1 = new Node(5);
        head1.next= new Node(10);
        head1.next.next = new Node(15);
        Node head2 = new Node(2);
        head2.next= new Node(3);
        head2.next.next = new Node(20);

        MergeTwoLists obj = new MergeTwoLists();
        Node list3 = obj.mergelist(head1,head2);
        obj.printList(list3);
    }
}
