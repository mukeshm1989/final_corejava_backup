package com.corejava.ds.self;

import java.util.Stack;

public class ExQueueUsingStack {
	
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();
	
	public static void inQueue(int x) {
		
		while(!stack1.empty()) {
			stack2.push(stack1.pop());	
		}
		stack1.push(x);
		
		while (!stack2.empty()) {
			stack1.push(stack2.pop());
			
		}
	}
		
	public static int deQueue() {
		
		if(stack1.size()==-1) {
			return -1;
		}
		int x = stack1.peek();
		stack1.pop();
		return x;
	}
	
	public static void main(String[] args) {
		ExQueueUsingStack exQueueUsingStack = new ExQueueUsingStack();
		
		exQueueUsingStack.inQueue(1);
		exQueueUsingStack.inQueue(2);
		exQueueUsingStack.inQueue(3);
		
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
	}
			

}
