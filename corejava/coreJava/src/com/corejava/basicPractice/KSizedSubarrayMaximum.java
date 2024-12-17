package com.corejava.basicPractice;

public class KSizedSubarrayMaximum {
	
//		Input:
//		N = 9, K = 3
//		arr[] = 1 2 3 1 4 5 2 3 6
//		Output: 
//		3 3 4 5 5 5 6 
//		Explanation: 
//		1st contiguous subarray = {1 2 3} Max = 3
//		2nd contiguous subarray = {2 3 1} Max = 3
//		3rd contiguous subarray = {3 1 4} Max = 4
//		4th contiguous subarray = {1 4 5} Max = 5
//		5th contiguous subarray = {4 5 2} Max = 5
//		6th contiguous subarray = {5 2 3} Max = 5
//		7th contiguous subarray = {2 3 6} Max = 6
	
	public static void main(String[] args) {
		//int[] arr = {1, 2, 3,1, 4, 5, 2, 3, 6};
		int arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
		//int k = 3;
		int k =4;
		
		for(int i=0;i<arr.length-(k-1);i++) {
			int max = 0;
			for(int j=i;j<k+i;j++) {
				if(arr[j]>max) {
					max = arr[j];
				}
			}
			System.out.println(max+" ");
		}
			
		
	}

}
