package com.rough;

import java.util.HashMap;
import java.util.Map;

public class PairOfSum {
	public static void main(String[] args) {
        int[] arr = {2,4,5,1,2,8};
        int n = arr.length;
        int sum = 6;
        printPairs(arr, n, sum);
	}
	
	public static void printPairs(int[] arr,int n,int sum) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++) {
			int rem = sum-arr[i];
			if(rem == arr[i]) {
				if(map.containsKey(rem) && (map.get(rem)==1)) {
					System.out.println(rem + "," + arr[i]);
				}
			}
				else if(map.containsKey(rem) && ! map.containsKey(arr[i])) {
					System.out.println(rem + "," + arr[i]);
				}
			map.put(arr[i], 1);
		}
		
	}

}
