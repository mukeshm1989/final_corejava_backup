package com.corejava.micosoft;

public class MissingArray {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,6};
		
		int length = arr.length;
		int sum=0;
		int N = arr.length+1;
		
		for(int i=0;i<length;i++) {
			sum = sum+arr[i];
		}
		
		int  mis =(N*(N+1)/2)-sum;
		System.out.println(mis);
		
	}

}
