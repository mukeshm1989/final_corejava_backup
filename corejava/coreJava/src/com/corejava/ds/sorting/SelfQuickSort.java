package com.corejava.ds.sorting;

public class SelfQuickSort {
	
	public static void main(String[] args) {
		
		int arr[]= {12,6,1,7,15};
		int n = arr.length;
		quickSort(arr,0,n-1);
		printArray(arr);
	}
	public static void quickSort(int arr[], int low, int high) {
		if(low<high) {
			int pi = partitation(arr,low,high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	
	public static int partitation(int arr[],int low,int high) {
		
		int pivot = arr[high];
		int i =low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return (i+1);
	}
	public static void swap(int arr[],int i,int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] =temp;
	}
	
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
	
