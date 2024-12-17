package com.rough;

public class DoublyLinstListFinal {
	
	static MyNode head = null;
	static MyNode tail = null;
			
	
	public static void main(String[] args) {
		
	}
	
	public static void InsertFromBegning(int n) {
		MyNode temp = new MyNode(n);
		
		if(head == null) {
			head = temp;
			tail = temp;
		}else {
			temp.next = head;
			head.prev = temp;
			head = temp;
		}
	}
	
	public static void insertFromEnd(int n) {
		MyNode temp = new MyNode(n);
		
		if(tail == null) {
			head = null;
			tail = null;
		}else {
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
		}
	}
	
	public static void insertForSpecicificPosition(int n , int position) {
		
		MyNode temp = new MyNode(n);
		if(position ==1) {
			InsertFromBegning(n);
		}else {
			MyNode current = head;
			int curPoistion =0;
			while(current != null && curPoistion <position) {
				curPoistion++;
				current = current.next;
			}if(current == null) {
				insertFromEnd(n);
			}else {
				temp.next = current;
				temp.prev = current.prev;
				current.prev.next = temp;
				current.prev = temp;
			}
		}
		
	}
	
	public static void  deleteFromBegning() {
		
		if(head == null) {
			return;
		}if(head == tail) {
			head =null;
			tail=null;
			return;
		}else {
			MyNode temp = head;
			head.next =head;
			head.prev = null;
			temp.next = null;
		}
	}
	
	public static void deleteFromEnd() {
		
		if(tail == null) {
			return;
		}else if(head == tail) {
			head =null;
			tail = null;
			return;
		}else {
			MyNode temp = tail;
			tail.prev = tail;
			tail.next = null;
			temp.prev = null;
		}
	}
	
	public static void deleteFromSpecificPosition(int data , int n) {
		if(n == 0) {
			deleteFromBegning();
		}else {
			int curPosition = 1;
			MyNode currNode = head;
			
			while(currNode != null && curPosition<n) {
				currNode = currNode.next;
				curPosition++;
			}if(currNode == null) {
				deleteFromEnd();
			}else {
				currNode.prev.next = currNode.next;
				currNode.next.prev = currNode.prev;
				currNode.next = null;
				currNode.prev = null;
			}
		}
	}

}

class MyNode {
	MyNode next;
	MyNode prev;
	int data;
	
	public MyNode(int n) {
		this.data = n;
		next = null;
		prev = null;
	}
	
}
