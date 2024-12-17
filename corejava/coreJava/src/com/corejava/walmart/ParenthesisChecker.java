package com.corejava.walmart;

import java.util.Stack;

public class ParenthesisChecker {
	
	public static void main(String[] args) {
		String str = "{([])}";
		
		boolean valid = isValidateParenthesis(str);
		System.out.println(valid);
	}
	
	public static boolean isValidateParenthesis(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			char x = ch[i];
			if(x =='(' || x =='{' ||  x =='[') {
				stack.push(ch[i]);
			}
			switch(x) {
			case ')':
				stack.pop();
				break;
			case '}':
				stack.pop();
				break;
			case ']':
				stack.pop();
				break;
				
			}
		}
		return stack.isEmpty();
	}

}
