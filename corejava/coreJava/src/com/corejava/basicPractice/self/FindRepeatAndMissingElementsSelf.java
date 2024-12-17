package com.corejava.basicPractice.self;

public class FindRepeatAndMissingElementsSelf {
	
	public static void main(String[] args) {
		
		int arr[] = { 7, 3, 4, 5, 5, 6, 2 ,1,9};
		
		int n = arr.length;
		
		findMissingAndduplicate(arr,n);
	
	}
	
	public static void findMissingAndduplicate(int[] arr,int n) {
		
		System.out.print("Duplicate value : ");
		for(int i=0;i<n;i++) {
			int abs_val = Math.abs(arr[i]);
			if(arr[abs_val-1]>0) {
				arr[abs_val-1] = -arr[abs_val-1];
			}else {
				System.out.println(abs_val);
			}
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				System.out.println("Missing value is : " + (i+1));
			}
		}
		
	}
}
