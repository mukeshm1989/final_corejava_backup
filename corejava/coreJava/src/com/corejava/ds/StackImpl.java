package com.corejava.ds;

public class StackImpl {
	private int maxsize;
	private int [] stackArray;
	private int top;
	
	public StackImpl(int size) {
		maxsize = size;
        stackArray = new int[maxsize];
        top = -1;
		
	}
	
	private void stackpush(int n) {
		
		if(top==maxsize-1) {
            System.out.println("Stack overflow");
            return;
		}
		stackArray[++top] = n; 
		System.out.println(n + " pushed into the stack");
	}
	
	private int stackpop() {
		if(top==-1) {
			System.out.println("Stack underflow");
            return -1;
		}
		int popElement = stackArray[top--];
		System.out.println(popElement + " popped from the stack");
		return popElement;
	}
	
	private int top() {
		if(top==-1) {
        System.out.println("Stack is empty");
        return -1;
		}
		return stackArray[top];
	}
	
	private boolean isEmpty() {
		return (top == -1);
	}

	public static void main(String[] args) {
		
		StackImpl stackImpl = new StackImpl(5);
		
		stackImpl.stackpush(10);
		stackImpl.stackpush(20);
		stackImpl.stackpush(30);
		stackImpl.stackpush(40);
		stackImpl.stackpush(50);
		
		stackImpl.stackpop();
		
	}

}
