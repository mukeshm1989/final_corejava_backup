package com.corejava.basicPractice;

public class Equilibrium {
	public static void main(String[] args) {
		int arr[] = {3, -5, 4, 3, 6, 1, 7, 6, -2};
		int result = getPivot(arr);
		System.out.println(result);
	}

	public static int getPivot(int arr[]) {
		
		if(arr.length==0) {
			return -1;
		}
		
		int rightSum =0;
		int leftSum = 0;
		
		for(int i=1;i<arr.length;i++) {
			rightSum = rightSum+arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			if(leftSum == rightSum) {
				return i;
			}
			leftSum = leftSum+arr[i];
			if(i+1<arr.length) {
				rightSum = rightSum-arr[i+1];
			}
		}
		return -1;
	}
}
