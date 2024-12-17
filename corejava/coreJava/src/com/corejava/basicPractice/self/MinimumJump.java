package com.corejava.basicPractice.self;

public class MinimumJump {
	
	
//	Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}, n = 11
//	Output: 3 
//	Explanation:First jump from 1st element to 2nd element with value 3. 
//	From here we jump to 5th element with value 9, and from here we will jump to the last. 

	public static void main(String[] args) {
		
		//int[] arr ={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		int arr[] = {0, 10, 20};
		int n = arr.length;
		int jump = 0;
		int count = 0;
		for(jump =0; jump < n ; jump ++) {
			if(arr[jump] ==0) {
				System.out.println("-1");
			}
			if(arr[jump] < n) {
				count++;
				jump++;
				n = n-jump;
			}
		}
		System.out.println(count);
	}
	
}
