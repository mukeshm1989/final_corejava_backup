package com.corejava.basicPractice;

import java.util.HashSet;

public class RemoveloopFromLinkedList {
	static Node head; // head of list

    /* Linked list Node*/
    static class Node {
        int data;
        Node next;
        Node(int x)
        {
            data = x;
            next = null;
        }
    }

    // Function to print the linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // funtion to detect and remove loop from linked list
    static void removeLoop(Node head)
    {
        HashSet<Node> s = new HashSet<Node>();
        Node prev = null;
        while (head != null) {
            // If we have already has this node
            // in hashmap it means there is a cycle and we
            // need to remove this cycle so set the next of
            // the previous pointer with null.

            if (s.contains(head)) {
                prev.next = null;
                return;
            }

            // If we are seeing the node for
            // the first time, insert it in hash
            else {
                s.add(head);
                prev = head;
                head = head.next;
            }
        }
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
    	RemoveloopFromLinkedList llist = new RemoveloopFromLinkedList();

        llist.head = new Node(50);
        llist.head.next = new Node(20);
        llist.head.next.next = new Node(15);
        llist.head.next.next.next = new Node(4);
        llist.head.next.next.next.next = new Node(10);

        /*Create loop for testing */
        llist.head.next.next.next.next.next
            = llist.head.next.next;

        removeLoop(llist.head);
        System.out.println(
            "Linked List after removing loop");
        llist.printList(llist.head);
    }
}
