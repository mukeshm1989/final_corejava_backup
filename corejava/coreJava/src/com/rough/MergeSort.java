package com.rough;

public class MergeSort {
	public static void main(String[] args) {
		
		int[] arr = {2,6,5,3,57,6};
		
		sort(arr,0,arr.length-1);
		print(arr);
	}
	
	public static void sort(int[] arr,int low,int high) {
		
		
		if(low<high) {
			int mid = (low+high)/2;
			
			sort(arr, low, mid);
			sort(arr, mid+1, high);
			mergeAndSort(arr,low,high,mid);
		}
	}
	
	public static void mergeAndSort(int[] arr,int low,int high,int mid) {
		
		int leftSize = mid-low+1;
		int rightSize = high-mid;
		
		int[] leftArray = new int[leftSize];
		int[] rightArray = new int[rightSize];
		
		
		for(int i=0; i< leftArray.length; i++) {
			leftArray[i] = arr[low+i];
		}
		
		for(int j=0; j< rightArray.length; j++) {
			rightArray[j] = arr[mid+1+j];
		}
		int i=0,j=0;
		int k =low;
		
		while(i<leftSize  && j < rightSize) {
			if(leftArray[i] <=rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			}else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while (i<leftSize) {
			arr[k] = leftArray[i];
			i++;
			k++;
			
		}
		
		while (j<rightSize) {
			arr[k] = rightArray[j];
			j++;
			k++;
			
		}
		
	}
	
	public static void print(int[] arr) {
		for(int i = 0 ; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
