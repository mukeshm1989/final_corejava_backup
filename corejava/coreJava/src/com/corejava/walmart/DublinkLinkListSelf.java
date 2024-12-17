package com.corejava.walmart;

public class DublinkLinkListSelf {
	
	static MyNode head = null;
	static MyNode tails = null;
	
	public static void insertFromBeging(int data) {
		MyNode temp = new MyNode(data);
		
		if(head==null) {
			head = temp;
			tails = temp;
		}else {
			temp.next = head;
			head.prev = temp;
			head = temp;
		}
	}
	
	public static void insertFromEnd(int data) {
		MyNode temp = new MyNode(data);
		
		if(tails == null) {
			tails = temp;
			head = temp;
		}else {
			tails.next = temp;
			temp.prev = tails;
			tails = temp;
		}
	}
	
	public static void insertForPosition(int data , int position) {
		
		MyNode temp = new MyNode(data);
		
		if(position ==1) {
			insertFromBeging(data);
		}else {
			MyNode current = head;
			int currentPosition =1;
		while(current !=null && currentPosition <position) {
			current = current.next;
			currentPosition++;
		}if(current == null) {
			insertFromEnd(data);
		}else {
			temp.next = current;
			temp.prev = current.prev;
			current.prev.next = temp;
			current.prev = temp;
			
		}
		}
	}
	
	public static void deleteNodeFromBegning() {
		
		if(head == null) {
			return;
		}
		if(head == tails) {
			head =null;
			tails =null;
			return;
		}else {
			MyNode temp = head;
			head = head.next;
			head.prev = null;
			temp.next = null;
		}
	} 
	
	public static void deleteNodeFromEnd() {
		
		if(tails == null) {
			return;
		}
		if(tails ==head) {
			tails =null;
			head =null;
			return;
		}else {
			MyNode temp = tails;
			tails = tails.prev;
			tails.next = null;
			temp.prev = null;
			
		}
	}
	
	public static void deleteNodeFromSpecificPosition(int data , int position) {
		
		if(position == 1) {
			deleteNodeFromBegning();
		}
		
		MyNode curMyNode = head;
		int countPosition=1;
		
		while(curMyNode !=null && countPosition != position) {
			curMyNode = curMyNode.next;
			countPosition++;
		}
		if(curMyNode == tails) {
			deleteNodeFromEnd();
		}else {
			curMyNode.prev.next = curMyNode.next;
			curMyNode.next.prev = curMyNode.prev;
			curMyNode.next = null;
			curMyNode.prev = null;
		}
		
	}
	
	public static void main(String[] args) {
		//insertFromEnd(1); 
		//insertFromEnd(2); 
		//insertFromEnd(3); 
		//insertFromEnd(4); 
		//insertFromEnd(5);
		//System.out.print("After insertion at tail: "); 
		//display(head);
	     System.out.print("After insertion at head: "); 
	     insertFromBeging(10); 
	     insertFromBeging(20);
	     insertFromEnd(30);
	     display(head);
//	     insertAtPosition(6, 2); 
//	     System.out.print( 
//	     "After insertion at 2nd position: "); 
//	     display(head);
	     insertForPosition(40, 2);
	     display(head);
	}
    static void display(MyNode head) 
    { 
    	MyNode temp = head; 
        while (temp != null) { 
            System.out.print(temp.data + " --> "); 
            temp = temp.next; 
        } 
        System.out.println("NULL"); 
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
