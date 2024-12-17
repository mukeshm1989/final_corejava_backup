package com.corejava.basicPractice;

import java.util.Arrays;

public class CountInversionsUsingMergeSort {
	
	public static void main(String[] args) {
		
		//int arr[] = {8, 4, 2, 1};
		
		int arr[] = {4, 8, 2, 1};
		
		// (8,4)(8,2)(8,1)(4,2)(4,1)(2,1)
		
		int low = 0;
		int high = arr.length-1;
		
		int count  = mergeSortAndCount(arr,low ,high);
		System.out.println(count);
	}
	
	public static int mergeSortAndCount(int arr[] , int low , int high) {
		
		int count =0;
		
		if (low<high) {
			
			int mid = (low+high)/2;
			
			count +=mergeSortAndCount(arr,low,mid);
			
			count += mergeSortAndCount(arr,mid+1,high);
			
			count +=mergeAndCount(arr,low,mid,high);
			
		}
		
		return count;
		
	}
	
	public static int mergeAndCount(int arr[],int low,int mid,int high) {
		
		// Left subarray 
				int[] left = Arrays.copyOfRange(arr, low, mid + 1);

		// Right subarray 
				int[] right = Arrays.copyOfRange(arr, mid + 1, high + 1);

				int i = 0, j = 0, k = low, count = 0;

				while (i < left.length && j < right.length) {
					if (left[i] <= right[j]) {
						arr[k++] = left[i++];
					}else {
						arr[k++] = right[j++];
						count += (mid + 1) - (low + i);
					}
				}
				while (i < left.length)
					arr[k++] = left[i++];
				while (j < right.length)
					arr[k++] = right[j++];
				return count;
		
	}

}
