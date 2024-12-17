package com.corejava.walmart.second;

import java.util.Stack;

public class BalanceBracket {

	public static void main(String[] args) {
		
		String str = "({([]})";
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0;i<str.length();i++) {
			char x = str.charAt(i);
			if(x=='('||x=='{' || x=='[') {
			stack.push(str.charAt(i));
			continue;
			}
			if(stack.isEmpty()) {
				System.out.println("true");
			}
			switch(x) {
			case']':
			stack.pop();
			break;
			case'}':
				stack.pop();
				break;
			case')':
				stack.pop();
				break;
			}
		}
		if(stack.isEmpty()) {
			System.out.println("test1 true");
		}else {
			System.out.println("false");
		}
	}
}
