package com.corejava.basicPractice.self;

import java.util.HashMap;
import java.util.Map;

public class PairsOfSum {

	 public static void main(String[] args) {
	        int[] arr = {2,4,5,1,2,8};
	        int n = arr.length;
	        int sum = 6;
	        printPairs(arr, n, sum);
	    }
	 
	 public static void printPairs(int[] arr, int n,int sum) {
		Map<Integer,Integer> map = new HashMap<>();
	        for(int i=0;i<arr.length;i++) {
	            int rem = sum - arr[i];
	                if(map.containsKey(rem)){
	                	 System.out.println(rem +","+ arr[i]);
	                }else {
	                    map.put(arr[i],i);
	                }
	            }
	        
	 }
}
