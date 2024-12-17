package com.rough;

public class FindMissingAndDuplicate {
	
	public static void main(String[] args) {
		int arr[] = { 7, 3, 4, 5, 5, 6, 2 };
		
		for(int i=0; i<arr.length; i++) {
			int abs_value = Math.abs(arr[i]);
			if(arr[abs_value-1]>0) {
				arr[abs_value-1] = -arr[abs_value-1];
			}else {
				System.out.println(abs_value);
			}
		}
		
		System.out.println("Missing Value : ");
		for(int i = 0 ; i< arr.length; i++) {
			if(arr[i] > 0) {
				System.out.println(i+1);
			}
		}
	}
}
