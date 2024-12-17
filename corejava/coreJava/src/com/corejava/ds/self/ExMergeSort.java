package com.corejava.ds.self;

public class ExMergeSort {
	public static void main(String[] args) {
		int arr[] = {2,1,6,7,5};
		int n =mergeSort(arr,0,arr.length-1);
		//print(arr);
		System.out.println(n);
	}
	
	public static int mergeSort(int arr[],int low,int high) {
		
		int count=0;
		
		if(low<high) {
			int mid = (low+high)/2;
			
			count+=mergeSort(arr,low,mid);
			count+=mergeSort(arr,mid+1,high);
			count+=merge(arr,low,mid,high);
			
		}
		return count++;
	}
	
	public static int merge(int arr[],int low,int mid,int high) {
		
		int lArraySize = mid-low+1;
		int rArraySize = high-mid;
		int count=0;
		int[] lArray = new int[lArraySize];
		int[] rArray = new int[rArraySize];
		
		for(int i=0;i<lArraySize;i++) {
			lArray[i] = arr[low+i];
		}
		for(int j=0;j<rArraySize;j++) {
			rArray[j] = arr[mid+1+j];
		}
		int i=0,j=0;
		int k=low;
		
		while(i<lArraySize && j<rArraySize) {
			if(lArray[i]<rArray[j]) {
				arr[k] = lArray[i];
				i++;
			}else {
				arr[k] = rArray[j];
				j++;
				count++;
				System.out.println(arr[k]+","+arr[j]);
			}
			k++;
		}
		while(i<lArraySize) {
			arr[k] = lArray[i];
			i++;
			k++;
		}
		while(j<rArraySize) {
			arr[k] = rArray[j];
			j++;
			k++;
		}
		return count;
	}
	
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	

}
