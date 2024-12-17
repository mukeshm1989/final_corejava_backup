package com.corejava.walmart;

import java.util.Arrays;

public class MinimumPlatforms {
	
	public static void main(String[] args) {
		
		int[] arr = {900, 940, 950, 1100, 1500, 1800};
	    int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
	    
	    int platformCount = countMinimunPlatformCount(arr,dep,arr.length);
	    System.out.println(platformCount);
	    	
	    }
	
	public static int countMinimunPlatformCount(int[] arr, int[] dep,int n) {
		int platform_needed =1,result =1;
		int i=1,j=0;
		
		Arrays.sort(arr);
		Arrays.sort(dep);
		while (i<n && j<n) {
			if(arr[i]<=dep[j]) {
				platform_needed++;
				i++;
			}else if(arr[i]>dep[j]) {
				platform_needed--;
				j++;
			}if(platform_needed>result) {
				result = platform_needed;
			}
			
		}
		
		return result;
	}

}
