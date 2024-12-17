package com.corejava.walmart.second;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		int key =50;
		int low =0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(arr[mid] == key) {
				System.out.println(mid);
				break;
			}else if(arr[mid] > key) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
 	}

}
