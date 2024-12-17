package com.corejava.walmart;

public class Sort0s1sand2s {
	public static void main(String[] args) {
		
		int[] arr = {0,2, 1, 2 , 0};
		
		int high = arr.length-1;
		
		sortArray(arr,0,high);
		printArray(arr);
	}
	
	public static void sortArray(int[] arr,int low,int high) {
		
		if(low<high) {
			int pos = partitation(arr,low,high);
			sortArray(arr, low, pos-1);
			sortArray(arr, pos+1, high);
		}
		
	}
	
	public static int partitation(int[] arr,int low,int high) {
		
		int pivot = arr[high];
		int i = low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
			i++;
			swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return i+1;
		
	}
	
	public static void swap(int[] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	public static void printArray(int[] arr) {
		
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
