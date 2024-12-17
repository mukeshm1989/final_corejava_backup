package com.corejava.ds;

public class StackImplSelf {
	private int maxSize;
	private int [] stackArray;
	private int top;
	
	public StackImplSelf(int size) {
		maxSize = size;
		stackArray = new int[size];
		top= -1;
	}
	
	private void stackPush(int n) {
		
		if(top==maxSize-1) {
			System.out.print("Stack is over flow");
			return;
		}
		stackArray[++top] =n;
		System.out.println(n + "Push into the stack");
	}

	private int stackpop() {
		if(top==-1) {
			System.out.print("Stack is over flow");
			return -1;
		}
		int popElement = stackArray[top--];
		System.out.println(popElement+ "Poped from the stack");
		return popElement;
	}
	
	private int stackTop() {
		if(top==-1) {
			System.out.print("Stack is over flow");
			return -1;
	}
		return stackArray[top];
}
	private boolean isEmpty() {
		return (top== -1);
	}
	public static void main(String[] args) {
		
		
		StackImplSelf stackImpl = new StackImplSelf(5);
		
		stackImpl.stackPush(10);
		stackImpl.stackPush(20);
		stackImpl.stackPush(30);
		stackImpl.stackPush(40);
		stackImpl.stackPush(50);
		
		stackImpl.stackpop();
	}
}
