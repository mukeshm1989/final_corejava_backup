package com.rough;

public class PeakNumberFromArray {
	public static void main(String[] args) {
		int[] arr = {2,5,7,21,8,9,6};
		int n = arr.length;
		int pickNumber = findPickNumber(arr,0,n-1,n);
		System.out.println(pickNumber);
 	}
	
	public static int findPickNumber(int[] arr,int low,int high, int n) {
		
		int mid = low + (low+high)/2;
		
		if(mid == 0 || (arr[mid-1]<=arr[mid]) && (mid== n-1 || (arr[mid+1]<=arr[mid]))) {
			return mid;
		}else if(mid> 0 && arr[mid+1]>arr[mid]) {
			return findPickNumber(arr,low,mid-1,n);
		}else {
			return findPickNumber(arr,mid+1,high,n);
		}
		
	}

}
