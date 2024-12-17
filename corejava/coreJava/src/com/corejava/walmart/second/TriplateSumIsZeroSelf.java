package com.corejava.walmart.second;

public class TriplateSumIsZeroSelf {
	// Wrong
	public static void main(String[] args) {
		int arr[] = {0, -1, 2, -3, 1};
		int firstIndex=1;
		int secondIndex = 2;
		
		for(int i=0;  i<arr.length-1; i++) {
			int x = arr[i];
			if(x+arr[firstIndex]+arr[secondIndex]==0) {
				System.out.println(x + " "+ arr[firstIndex] + " " + arr[secondIndex]);
				firstIndex++;
				secondIndex++;
			}
		}
	}

}
