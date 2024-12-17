package com.corejava.basicPractice;

public class MinimizetheHeightsArray {
	
	// Need to improve this
	public static void main(String[] args) {
		int arr[] = {3, 9, 12, 16, 20};
		int k=3;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<arr.length) {
				arr[i] = arr[i]+k;
			}else {
				arr[i] = arr[i]-k;
			}
		}
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		int result = arr[arr.length-1]-arr[0];
		System.out.println(result);
	}

}
