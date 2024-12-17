package com.corejava.basicPractice;

public class PeakNumberFromArraySelf {

	public static void main(String[] args) {
		
		int arr[] = { 1, 22, 3, 20,21, 4, 1, 0 };
		
		int n =arr.length;
		
		int num = findPeack(arr,n);
		System.out.println(num);
	}
	
	public static int findPeack(int[] arr, int n) {
		
		return findPickUtil(arr,0,n-1,n);
		
	}
	
	public static int findPickUtil(int[] arr,int low,int high,int n) {
		
		int mid = low +(low+high)/2;
		
		if(mid==0 || arr[mid-1]<=arr[mid] && mid == n-1 || arr[mid+1]<arr[mid]) {
			return mid;
		}else if(mid>0 && arr[mid+1]>arr[mid]) {
			return findPickUtil(arr,low,mid-1,n);
		}else {
		return findPickUtil(arr,mid+1,high,n);
		}
	}
}
