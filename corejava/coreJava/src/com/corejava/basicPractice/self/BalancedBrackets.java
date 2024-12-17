package com.corejava.basicPractice.self;

import java.util.Stack;

public class BalancedBrackets {
	
	public static void main(String[] args) {
		String str = "({[]})";
		
		boolean isBalanced = isBalancedBrackets(str); 
		System.out.println(isBalanced);
	}
	
	public static boolean isBalancedBrackets(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			char x = str.charAt(i);
			if(x=='(' || x=='{' || x=='[') {
				stack.push(x);
			}
			
			char check;
			switch(x) {
			case'}':
				check  = stack.pop();
				if(check==')' || check == ']') {
					return false;
				}
				break;
			case']':
				check  = stack.pop();
				if(check=='}' || check == ')') {
					return false;
				}
				break;
			case')':
				check  = stack.pop();
				if(check=='}' || check == ']') {
					return false;
				}
				break;
			}
		}
		return stack.isEmpty();
	}

}
