package com.corejava.basicPractice;

public class ExQuickSort {
	
	public static void main(String[] args) {
		
		int arr[] = {0, 1 , 0};
		int n = arr.length;
		quicSort(arr, 0, n-1);
		print(arr);
	}

	public static void quicSort(int arr[], int low,int high) {
		if(low<high) {
			int ps = partitation(arr,low,high) ;
			quicSort(arr, low, ps-1);
			quicSort(arr, ps+1, high);
			}
		}
	public static int partitation(int arr[],int low,int high) {
		int pivot = arr[high];
		int i = low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return (i+1);
	}
	
	public static void swap(int arr[],int i ,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] =temp;
	}
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
