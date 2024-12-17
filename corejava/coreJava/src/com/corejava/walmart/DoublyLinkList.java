package com.corejava.walmart;

public class DoublyLinkList {
	
	static node head =null;
	static node tails = null;
	
	static void insertFromBegning(int n) {
		
		node temp = new node(n);
		if(head==null) {
			head =temp;
			tails = temp;
		}else{
			temp.next = head;
			head.prev= temp;
			head  = temp;
		}
	}
	
	static void insertFromEnd(int n) {
		node temp = new node(n);
		
		if(tails==null) {
			tails = temp;
			head = temp;
		}else {
			tails.next =temp;
			temp.prev =tails;
			tails = temp;
		}
	}
	
	static void insertAtPosition(int n, int position) {
		node temp = new node(n);
		if(position==1) {
			insertFromBegning(n);
		}else {
			node current = head;
			int curPosition =1;
			
			while(current != null && curPosition < position) {
				current = current.next;
				curPosition++;
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
	
	public static void main(String[] args) {
		//insertFromEnd(1); 
		//insertFromEnd(2); 
		//insertFromEnd(3); 
		//insertFromEnd(4); 
		//insertFromEnd(5);
		//System.out.print("After insertion at tail: "); 
		//display(head);
	     System.out.print("After insertion at head: "); 
	     insertFromBegning(0); 
	     display(head);
	     insertAtPosition(6, 2); 
	     System.out.print( 
	     "After insertion at 2nd position: "); 
	     display(head);
	}
    static void display(node head) 
    { 
        node temp = head; 
        while (temp != null) { 
            System.out.print(temp.data + " --> "); 
            temp = temp.next; 
        } 
        System.out.println("NULL"); 
    } 
}
class node {
	node next;
	node prev;
	int data;
	
	public node(int n) {
		
		next = null;
		prev = null;
		this.data = n;
	}
}
