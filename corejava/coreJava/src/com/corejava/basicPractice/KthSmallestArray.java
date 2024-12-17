package com.corejava.basicPractice;

public class KthSmallestArray {
	public static void main(String[] args) {
		int arr[] = {7 ,10 ,4, 20, 15};
		int high =arr.length-1;
		quickSort(arr,0,high);
		int k = 4;
		int value = arr[k-1];
		System.out.println(value);
	}
	
	public static void quickSort(int[] arr,int low ,int high) {
		
		if(low<high) {
		int ps = partation(arr,low,high);
		quickSort(arr,low,ps-1);
		quickSort(arr,ps+1,high);
	}
	}
	
	public static int partation(int[] arr,int low,int high) {
		
		int pivot = arr[high];
		int i = low-1;
		
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
			i++;
			swap(arr,i,j);
			}
		}swap(arr,i+1,high);
		return (i+1);
		
	}
	
	public static void swap(int arr[],int i,int j) {
		int temp =arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
