package com.corejava.basicPractice;

public class RemoveLoop {
	static Node head;
    static class Node {
        int data;
        Node next;
        Node(int x)
        {
            data = x;
            next = null;
        }
    }
	
	public static void removeCycle(Node slow, Node head) {
		  for (Node curr = head; curr != null; curr = curr.next) {
		    Node ptr = slow;
		    while (ptr.next != slow && ptr.next != curr) {
		      ptr = ptr.next;
		    }
		    if (ptr.next == curr) {
		      ptr.next = null;
		      return;
		    }
		  }
		}
		public static Node identifyCycle(Node head) {
		  Node slow = head, fast = head;
		 
		  while (fast != null && fast.next != null) {
		    slow = slow.next;
		    fast = fast.next.next;
		    if (slow == fast) {
		      return slow;
		    }
		  }
		  return null;
		}

		public static void main(String[] args) {
			RemoveLoop removeLoop = new RemoveLoop();
			removeLoop.head = new Node(4);
			removeLoop.head = new Node(1);
			removeLoop.head = new Node(3);
			removeLoop.head = new Node(5);
			
			
			
		}
}
