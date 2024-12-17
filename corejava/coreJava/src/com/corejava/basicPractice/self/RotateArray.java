package com.corejava.basicPractice.self;

import java.util.Stack;

public class RotateArray {
//	Input: n = 5, d = 2 arr[] = {1,2,3,4,5}
//	Output: 3 4 5 1 2
//	Explanation: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.

	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int j =0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i=0;i<arr.length;i++) {
			stack.push(arr[i]);
		}
		System.out.println(stack);
		while(!stack.isEmpty()) {
			arr[j] = stack.pop();
			j++;
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
