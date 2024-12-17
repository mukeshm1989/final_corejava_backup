package com.corejava.basicPractice;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int arr[] = {3,5,2,7,10,15,20,23};
		
		int length = arr.length-1;
		int key =10;
		int findIndex = findIndex(arr,key,0,length);
		System.out.println("Index : "+findIndex);
	}
	
	public static int findIndex(int[] arr,int key,int low,int high) {
		
		while(low<=high) {
			
			int mid = (low+high)/2;
			if(arr[mid] == key) {
				return mid;
			}
			if(arr[mid]>key) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return -1;
	}

}
