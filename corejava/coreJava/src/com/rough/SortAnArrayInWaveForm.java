package com.rough;

public class SortAnArrayInWaveForm {

	public static void main(String[] args) {
		int arr[] = {10, 90, 49, 2, 1, 5, 23};
		
		sortArrWave(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}	
	}
	
	public static void sortArrWave(int[] arr) {
		for(int i=0;i<arr.length-1;i+=2) {
			if(i>0 && arr[i-1]>arr[1]) {
				swap(arr,i,i-1);
			}else if(i<arr.length-1 && arr[i+1]>arr[i]) {
				swap(arr,i,i+1);
			}
		}
	}
	
	public static void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
