package com.rough;

public class TestRough {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,7};
		
		int N = arr.length+1;
		int sum = 0;
		int missingValue = 0;
		for(int i =0;i<arr.length;i++) {
			sum+= arr[i];
		}
		missingValue = (N*(N+1)/2)-sum;
		System.out.println(missingValue);
 	}

}
