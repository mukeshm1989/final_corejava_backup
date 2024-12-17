package com.corejava.basicPractice;

import java.util.Stack;

public class ReverseStringUsingStack {
	public static void main(String[] args) {
		
		String str = "mukesh";
		String result ="";
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			stack.push(str.charAt(i));
		}
		
		while (!stack.isEmpty()) {
			result =result+ Character.valueOf(stack.pop());
		}
		System.out.println(new String(result));
	}

}
