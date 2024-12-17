package com.corejava.ds.sorting;

public class BinarySearch {

	
	public static void main(String[] args) {
		
		int[] arr = {3,4,6,7,10,25,30};
		
		int n= arr.length;
		
		int key = 10;
		
		int findKey = binarySerachKey(arr,0,n-1,key);
		
		if (findKey == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + findKey);
	}
	
	public static int binarySerachKey(int arr[],int l,int r,int key) {
		
		while(l<=r) {
			int mid = (l+r)/2;
			if(arr[mid]==key) {
				return mid;
			}else if(arr[mid]>key) {
				r = mid-1;
			}else {
				l = mid+1;
			}
		}
		return -1;
		
	}
}
