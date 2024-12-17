package com.corejava.basicPractice;

import java.util.Arrays;

public class FindAllTripletsWithZeroSum {
	public static void main(String[] args) {
		int arr[] = {0, -1, 2, -3, 1};
		int length = arr.length;
		boolean flag= false;
		Arrays.sort(arr);
		for(int i=0; i<length-1;i++) {
			int left =i+1;
			int right = length-1;
			int x = arr[i];
			while(left < right) {
				if(x+arr[left]+arr[right] == 0) {
					System.out.println(x + " "+ arr[left] + " " + arr[right]);
					left++;
					right--;
					flag = true;
				}else if(x+arr[left]+arr[right] < 0) {
					left++;
				}else {
					right--;
				}
			}
		}
		if(!flag) {
			System.out.println(false);
		}
	}

}
