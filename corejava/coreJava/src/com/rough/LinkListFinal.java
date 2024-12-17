package com.rough;

import java.util.HashSet;
import java.util.Set;

import com.rough.LinkedList.Node;

public class LinkListFinal {
	static TestNode head;
	
	static class TestNode {
		TestNode next;
		int data;
		
		public TestNode(int n) {
			this.data = n;
			next = null;
					
		}
		
	}
	
	public static LinkListFinal insertIntoList(LinkListFinal list, int n) {
		
		TestNode new_node = new TestNode(n);
		new_node.next = null;
		
		if(head == null) {
			list.head = new_node;
		}else {
			TestNode lastNode = list.head;
			while(lastNode.next!= null) {
				lastNode = lastNode.next;
			}
			lastNode.next = new_node;
		}
		
		return list;
		
	}
	
	
	public static TestNode reverseList(TestNode head) {
		
		TestNode next =null;
		TestNode prev = null;
		TestNode current = head;
		if(current == null) {
			return head;
		}else {
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			next = current;
		}
		head = prev;
	}
		return head;
		
	}
	
	public static LinkListFinal deleteNodeByKey(LinkListFinal list , int key) {
		TestNode currentNode = list.head;
		TestNode prev = null;
		if(currentNode.next != null && currentNode.data==key) {
			list.head = currentNode.next;
		}
		while(currentNode.next != null && currentNode.data != key) {
			currentNode = currentNode.next;
			prev  = currentNode;
			
			if(currentNode.next != null) {
				prev.next = currentNode.next;
			}
		}
		return list;
	}
	
	public static LinkListFinal deleteListForIndex(LinkListFinal list , int index) {
		
		TestNode currentNode = list.head;
		TestNode prev = null;
		
		if(currentNode.next!= null && index==0) {
		list.head = currentNode.next;	
		}
		int counter =0;
		while(currentNode.next != null) {
			if(index == counter) {
				prev.next = currentNode.next;
			}else {
				currentNode = currentNode.next;
				prev = currentNode;
			}
		}
		return list;
	}
	
	public static boolean detectLoop(TestNode head) {
		
		Set<TestNode> set = new HashSet<TestNode>();
		while(head != null) {
			if(set.contains(head)) {
				return true;
			}
			set.add(head);
			head =head.next;
		}
		return false;
		
	}
	public static void main(String[] args) {
		
	}

}
