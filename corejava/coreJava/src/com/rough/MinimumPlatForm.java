package com.rough;

public class MinimumPlatForm {
	
	public static void main(String[] args) {
		int[] arr = {900, 940, 950, 1100, 1500, 1800};
	    int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
	    
	    int result=1,platform_needed = 1;
	    int i=1,j=0;
	    
	    int n = arr.length;
	    
	    while (i<n && j<n) {
	    	if(arr[i]<dep[j]) {
	    		platform_needed++;
	    		i++;
	    	}else if(arr[i] > dep[j]) {
	    		platform_needed--;
	    		j++;
	    	}
	    	if(platform_needed>result) {
	    		result = platform_needed;
	    	}
	    }
	    System.out.println(result);
	}

}
