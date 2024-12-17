package com.corejava.walmart.second;

import java.util.HashSet;
import java.util.Set;

public class SelfLinkListImpl {
	static Node head;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int x) {
			this.data= x;
			this.next = null;	
		}
	}
	
	public static SelfLinkListImpl insertData(SelfLinkListImpl list , int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		
		if(list.head == null) {
			list.head = newNode;
		}else {
			Node last = list.head;
			while(last.next!=null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return list;
	}
	
	public static SelfLinkListImpl deleteNodeBasedOnData(SelfLinkListImpl list , int data) {
		Node currentNode = list.head;
		Node prev = null;
		
		if(currentNode== null || currentNode.data==data) {
			list.head = currentNode.next;
		}
		
		while(currentNode!=null && currentNode.data!=data) {
			prev = currentNode;
			currentNode = currentNode.next;
		}
		if(currentNode!=null) {
			prev.next = currentNode.next;
		}
		return list;
	}
	
	public static SelfLinkListImpl deleteNodeBasedOnIndex(SelfLinkListImpl list, int index) {
		Node  cuNode = list.head;
		Node prev = null;
		
		if(index == 0 && cuNode!=null) {
			list.head = cuNode.next;
		}
		int counter =0;
		
		while(cuNode!= null) {
		if(counter==index) {
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
	
	public static Node reverseList(Node list) {
		Node prev = null;
		Node next = null;
		Node current = list;
		
		if(current.next == null) {
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
	
	public static void detectLoopFromLinkList(Node head) {
		Set<Node> set = new HashSet<Node>();
		while(head != null) {
			if(set.contains(head)) {
				System.out.println("true");
			}else {
				set.add(head);
				head = head.next;
			}
		}
	}
	
	public static void removeLoopFromLinkList(Node head) {
		Node prev = null;
		Set<Node> set = new HashSet<SelfLinkListImpl.Node>();
		while(head != null) {
			if(set.contains(head)){
			prev.next = null;
			break;
			}else {
				set.add(head);
				prev = head;
				head = head.next;
			}
		}
	}
	
	public static void printList(SelfLinkListImpl list) {
		
		Node currNode =list.head;
		 System.out.print("LinkedList: ");
		
		while (currNode !=null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;
		}
		
	}
	
	static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
	
	public static void main(String[] args)
    { 
        /* Start with the empty list. */
    	SelfLinkListImpl list = new SelfLinkListImpl();
 
        //
        // ******INSERTION******
        //
 
        // Insert the values
        list = insertData(list, 1);
        list = insertData(list, 2);
        list = insertData(list, 3);
        list = insertData(list, 4);
        list = insertData(list, 5);
        list = insertData(list, 6);
        list = insertData(list, 7);
        list = insertData(list, 8);
 
        // Print the LinkedList
        printList(list);
        printList(list);
        deleteNodeBasedOnData(list, 4);
        printList(list);
        
        deleteNodeBasedOnIndex(list, 4);
        printList(list);
        
        System.out.println("After reverse Node");
        head= reverseList(head);
        System.out.println("Head");
        printList(head);
        
    }

}
