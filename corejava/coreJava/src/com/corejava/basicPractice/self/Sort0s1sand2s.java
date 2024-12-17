package com.corejava.basicPractice.self;

public class Sort0s1sand2s {
	
//	
//	Input: 
//	N = 5
//	arr[]= {0 2 1 2 0}
//	Output:
//	0 0 1 2 2
//	Explanation:
//	0s 1s and 2s are segregated 
//	into ascending order.
	
	public static void main(String[] args) {
		
		
		int[] arr =  {0 , 2 , 1 , 2 , 0};
		
		sortArray(arr,0,arr.length-1);
		ptintArray(arr);
	}
	
	public static void sortArray(int[] arr,int low,int high) {
		
		if(low<high) {
			int pos = partitation(arr,low,high);
			sortArray(arr, low, pos-1);
			sortArray(arr, pos+1, high);
		}	
	}
	public static int partitation(int[] arr, int low, int high) {
		
		int pivot  = arr[high];
		int i = (low-1);
		for(int j=low; j<high; j++) {
			if(arr[j] < pivot ) { 
				i++;
				swap(arr,i,j);
			}}
			swap(arr,i+1,high);
			return  (i+1);
	}
	public static void swap(int[] arr, int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void ptintArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
