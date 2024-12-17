package com.corejava.basicPractice;

public class FindTripletsWithZeroSum {
		public static void main(String[] args) {
	        int[] arr = {0, -1, 2, -3, 1};
	        int N = arr.length;
	        findTriplet(arr, N);
	    }

		public static void findTriplet(int[] arr, int N) {
			int count = 0;
			for(int i=0;i<N-2;i++) {
				if(arr[i]+arr[i+1]+arr[i+2] == 0) {
					count++;
				}
			}
			System.out.println(count);
		}
}
