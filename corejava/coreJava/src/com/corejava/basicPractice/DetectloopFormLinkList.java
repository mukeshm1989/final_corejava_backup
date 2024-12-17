package com.corejava.basicPractice;

import java.util.*;

public class DetectloopFormLinkList {
	static Node head;
	
	public static void main(String[] args) {
		DetectloopFormLinkList llist = new DetectloopFormLinkList();
		 
	        llist.push(20);
	        llist.push(4);
	        llist.push(15);
	        llist.push(10);

	        /*Create loop for testing */
	        llist.head.next.next.next.next = llist.head;

	        if (detectLoopWitoutUsingSet(head))
	            System.out.println("Loop Found");
	        else
	            System.out.println("No Loop");
	}

	static class Node {
		int data;
		Node next;
		 int flag;
		public Node(int n) {
			this.data = n;
			this.next = null;
			this.flag = 0;
		}
	}
	
	public static void push(int n) {
		Node newNode = new Node(n);
		newNode.next = head;
		head = newNode;
	}
	
	public static boolean detectLoop(Node head) {
		HashSet<Node> s = new HashSet<Node>();
		
		while (head != null) {
			if(s.contains(head)) {
				return true;
			}
			s.add(head);
			head = head.next; 
		}
		return false;
	}
	
    static boolean detectLoopWitoutUsingSet(Node head) {
        while (head != null) {

            // If this node is already traversed
            // it means there is a cycle
            // (Because you are encountering the
            // node for the second time).
            if (head.flag == 1) {
                return true;
            }
            // If we are seeing the node for
            // the first time, mark its flag as 1
            head.flag = 1;
            head = head.next;
        }
        return false;
    }
}


