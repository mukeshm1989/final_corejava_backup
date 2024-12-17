package com.corejava.ds;

import java.util.Stack;

public class SelfImplementQueueUsingStack {
	
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();
	
	public static void inqueue(int x) {
		
		while (!s1.empty()) {
			s2.push(s1.pop());
		}
		s1.push(x);
		
		while (!s2.empty()) {
			s1.push(s2.pop());
			
		}
	}
	
	public static int deQueque() {
		
		if(s1.peek()==-1) {
			System.out.println("Queue is empty");
		}
		
		int x = s1.peek();
		s1.pop();
		return x;
	}
	
	public static void main(String[] args) {
		
		SelfImplementQueueUsingStack seq= new SelfImplementQueueUsingStack();
		
		seq.inqueue(1);
		seq.inqueue(2);
		seq.inqueue(3);
		
		System.out.println(seq.deQueque());
		System.out.println(seq.deQueque());
		System.out.println(seq.deQueque());
	}

}
