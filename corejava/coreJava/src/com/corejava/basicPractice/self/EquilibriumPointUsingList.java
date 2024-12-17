package com.corejava.basicPractice.self;

public class EquilibriumPointUsingList {
	
//	Input: n = 5, arr[] = {1,3,5,2,2}
//	Output: 3 
//	Explanation: The equilibrium point is at position 3 as the sum of elements before it (1+3) = 
//	sum of elements after it (2+2). 
	
	public static void main(String[] args) {
		
		int[] arr= {1,3,5,2,2};
		int rightSum = 0;
		int leftSum =0;
		
		for(int i=1 ; i<arr.length; i++) {
			rightSum = rightSum+arr[i];
		}
		
			for(int i=0;i<arr.length;i++) {
				if(rightSum == leftSum) {
					System.out.println(i);
				}
				leftSum = leftSum+arr[i];
				if(i+1 < arr.length) {
					rightSum = rightSum-arr[i+1];
				}
			}
		}
	}