package com.corejava.interview;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int arr[] = {10, 10, 20, 20, 30, 40, 50, 50,50};
		
		Arrays.sort(arr);
		int count =0;
		int length = arr.length;
		int num = 0;
		double avgNum;
		
		for(int i=0;i<length-2;i++) {
			if(i== 0) {
				continue;
			}
			
			if(arr[0] == arr[i]) {
				continue;
			}
			num = num+arr[i];
			count++; 
			System.out.println(arr[i]);
		}
		avgNum = num/count;
		System.out.println(avgNum);
	}

}
