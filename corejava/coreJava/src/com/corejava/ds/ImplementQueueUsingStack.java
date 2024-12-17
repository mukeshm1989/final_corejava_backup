package com.corejava.ds;

import java.util.Stack;

public class ImplementQueueUsingStack {
	
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();
	
	public static void inQueue(int x) {
		
		while(!s1.empty()) {
			s2.push(s1.pop());
		}
		s1.push(x);
		
		while (!s2.empty()) {
			s1.push(s2.pop());
		}	
	}

	public static int deQueue() {
		
		if (s1.isEmpty()) 
        { 
            return -1;
        }
		 int x = s1.peek(); 
	        s1.pop(); 
	        return x; 
	}
	public static void main(String[] args) 
	{ 
		ImplementQueueUsingStack q = new ImplementQueueUsingStack(); 
	    q.inQueue(1); 
	    q.inQueue(2); 
	    q.inQueue(3); 
	 
	    System.out.println(q.deQueue()); 
	    System.out.println(q.deQueue());
	    System.out.println(q.deQueue());
	} 
}
