package com.corejava.basicPractice;

public class CountInversions {
	
	public static void main(String[] args) {
		
		int arr[] = {8, 4, 2, 6};
		int count =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
