package com.corejava.basicPractice;

import java.util.Arrays;

public class SmallestPositiveMissing {
	
	public static void main(String[] args)
    {
        int arr[] =  { 0, 10, 1 ,2 , -10, -20 };
        int n = arr.length;
        int ans = firstMissingPositive(arr, n);
        System.out.println(ans);
    }
	
	public static int firstMissingPositive(int[] arr, int n) {
		
		Arrays.sort(arr);
		int ans = 1;
		for(int i=0;i<n;i++) {
			if(arr[i] == ans) {
				ans++;
			}
		}
		
		return ans;
	}

}
