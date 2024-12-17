package com.corejava.basicPractice.self;

public class KthSmallest {
	
	
//	Input:
//	n = 6
//	arr[] = 7 10 4 3 20 15
//	k = 3
//	l=0 r=5
//
//	Output : 
//	7
//
//	Explanation :
//	3rd smallest element in the given 
//	array is 7.
	
	public static void main(String[] args) {
		
		int[] arr = {7 , 10 , 4 , 20 , 15};
		int key =4;
		sortArray(arr,0,arr.length-1);
		int smallestKey = arr[key-1];
		System.out.println(smallestKey);
	}

	public static void sortArray(int[] arr,int low, int high) {
		
		if(low<high) {
			int pos = partitation(arr,low,high);
			sortArray(arr, low, pos-1);
			sortArray(arr, pos+1, high);
		}
	}
	
	public static int partitation(int[] arr,int low,int high) {
		
		int pivot = arr[high];
		int i = (low-1);
		
		for(int j=low; j<high; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return (i+1);	
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
