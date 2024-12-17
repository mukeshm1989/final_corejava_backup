package com.corejava.walmart;

import java.util.HashSet;
import java.util.List;

public class LinkedList {
	
	static Node head;
	
	static class Node {
		
		Node next;
		int data;
		
		public Node(int n) {
			this.data = n;
			next = null;
		}
	}
	
	public  LinkedList insetValueToLinkList(LinkedList list,int n) {
	
	Node newNode = new Node(n);
	newNode.next = null;
	if(list.head == null) {
		list.head = newNode;
	}else {
		Node last = list.head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = newNode;
	}
	return list;
	}
	
	public Node reverse(Node list) {
		
		Node prev =null;
		Node next =null;
		Node current = list;
		
		if(current.next==null) {
			return list;
		}
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		list = prev;
		return list;
		
	}
	
	public LinkedList deleteKey(LinkedList list, int key) {
		
		Node currNode = list.head;
		Node prev =null;
		
		if(currNode != null && currNode.data == key) {
			list.head = currNode.next;
			return list;
		}
		
		while (currNode != null && currNode.data != key) {
			prev = currNode;
			currNode = currNode.next;
			if(currNode.next!=null) {
				prev.next = currNode.next;
			}	
		}
		
		return list;
		
	}
	
	public LinkedList deletebasedOnIndex(LinkedList list,int index) {
		
		Node cuNode = list.head;
		Node prev = null;
		if(cuNode != null && index == 0) {
			list.head = cuNode.next;
		}
		int counter = 0;
		while(cuNode != null) {
			if(index == counter) {
				prev.next = cuNode.next;
				break;
			}else {
				prev = cuNode;
				cuNode = cuNode.next;
				counter++;
			}
		}
		
		return list;
		
	}
	public static boolean detectLoop(Node h) {
		HashSet<Node> s = new HashSet<Node>();
		
		while (h != null) {
			if(s.contains(h)) {
				return true;
			}
			s.add(h);
			head = h.next; 
		}
		return false;
	}
	
	public Node reverseNodeBasedOngroup(Node node,int k) {
		
		Node prev =null;
		Node current = node;
		Node next = null;
		
		if(current.next == null) {
			return current.next;
		}
		int count = 0;
		while( count<k && current != null ) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count++;
		}
		if(next != null) {
			node.next = reverseNodeBasedOngroup(next,k);
		}
		return prev;
		
	}
	
	public static void main(String[] args) {
		int k = 3;
		LinkedList list = new LinkedList();
		
		list.insetValueToLinkList(list, 2);
		list.insetValueToLinkList(list, 4);
		list.insetValueToLinkList(list, 8);
		list.insetValueToLinkList(list, 12);
		list.insetValueToLinkList(list, 15);
		list.insetValueToLinkList(list, 16);
		list.insetValueToLinkList(list, 18);
		
		head = list.reverseNodeBasedOngroup(head, k);
		list.printList(head);
		//list.head.next.next.next.next = list.head.next;
		
		//boolean value = list.detectLoop(head);
		//System.out.println(value);
		//list.deletebasedOnIndex(list, 1);
		//list.printList(head);
//		list.deleteKey(list, 4);
//		list.printList(head);
		
		//list.printList(head);
		
		//head= list.reverse(head);
		//System.out.println();
		//list.printList(head);
	}
	
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
