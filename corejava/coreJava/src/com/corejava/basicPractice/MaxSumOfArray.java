package com.corejava.basicPractice;

public class MaxSumOfArray {

	public static int main(int[] arr) {
		int n = arr.length;
		int sum =0;
		for(int i=0;i<n;i++) {
			sum = sum +arr[i];
			if(sum <0) {
				return -1;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[] =  {-1,-2,-3,-4};
		int sum = main(arr);
		System.out.println(sum);
	}
}
