package com.rough;

public class CountInversionsUsingMergeSort {
	public static void main(String[] args) {
		
		int[] arr = {4, 8, 2, 1};
		
		int count = sortArray(arr,0,arr.length-1);
		System.out.println(count);
	}

	public static int sortArray(int[] arr,int low,int high) {
		
		int count =0;
		if(low<high) {
			
			int mid = (low+high)/2;
			
			count+=sortArray(arr, low, mid);
			count+=sortArray(arr, mid+1, high);
			count+=mergeAndSort(arr,low,high,mid);
		}
		return count;
	}
	
	public static int mergeAndSort(int[] arr,int low,int high,int mid) {
		
		int leftSize = mid-low+1;
		int rightSize = high -mid;
		
		int[] leftArray = new int[leftSize];
		int[] rightArray = new int[rightSize];
		
		for(int i=0; i<leftArray.length;i++) {
			leftArray[i] = arr[low+i];
		}
		
		for(int i=0; i<rightArray.length;i++) {
			rightArray[i] = arr[mid+1+i];
		}
		
		int i=0,j=0;
		int k = low;
		int count =0;
		
		while(i<leftSize && j <rightSize) {
			if(leftArray[i] < rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			}else {
				arr[k] = rightArray[j];
				j++;
				count += (mid+1)-(low+i);
			}
			k++;
		}
		
		while(i<leftSize) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while(j<rightSize) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
		
		
		return count;
		
	}
}
