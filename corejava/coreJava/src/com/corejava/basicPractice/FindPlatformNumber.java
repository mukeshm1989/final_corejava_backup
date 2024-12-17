package com.corejava.basicPractice;

import java.util.Arrays;

public class FindPlatformNumber {

	public static void main(String[] args) {
		
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
	    int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
	    
	    int n = arr.length;
	    
	    int numberOfPlatform = findPlatForm(arr,dep ,n);
	    System.out.println(numberOfPlatform);
	}
	public static int findPlatForm(int[] arr, int dep[] , int n) {
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		
		int plat_needed=1,result =1;
		int i=1,j=0;
		
		while(i<n && j<n) {
			if(arr[i]<= dep[j]) {
				plat_needed++;
				i++;
			}else if(arr[i] >dep[j]) {
				plat_needed--;
				j++;
			}
			if(plat_needed>result) {
				result = plat_needed;
			}
		}
		
		return result;
		
	}
    
    
}
