package com.tes;
import java.util.Stack;

public class BalanceBracket {
	
	public static void main(String[] args) {
		
		String str = "<{hello}>)";
		Stack<Character> stack = new Stack<Character>();
		for (int i=0; i<str.length();i++) {
			char x = str.charAt(i);
			if(x=='(' || x=='{' || x=='[' || x=='<') {
			stack.push(x);
			}
			if(stack.isEmpty()) {
				continue;
			}
			char ch = stack.peek();
			switch(x) {
			case')':
				if(ch=='(') {
				stack.pop();
				}
				break;
			case'}':
				if(ch=='{') {
				stack.pop();
				}
				break;
			case']':
				if(ch=='[') {
				stack.pop();
				}
				break;
			case'>':
				if(ch=='<') {
				stack.pop();
				}
				break;
			}
		}
		
		if(stack.isEmpty()) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
}
