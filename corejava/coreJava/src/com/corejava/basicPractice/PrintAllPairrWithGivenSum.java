package com.corejava.basicPractice;

import java.util.HashMap;
import java.util.Map;

public class PrintAllPairrWithGivenSum {
	public static void main(String[] args) {
		
		int arr[] = {1, 5, 7, -1, 5, 3, 3, 3};
		
		int sum = 6;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			int rem = sum -arr[i];
			if(rem == arr[i]) {
				if(map.containsKey(rem) && map.get(rem)==1) {
					System.out.println("(" + rem + ", " + arr[i] + ")");
				}}
				else if(map.containsKey(rem) && !map.containsKey(arr[i])){
					System.out.println("(" + rem + ", " + arr[i] + ")");
				}
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			}
			
		}
		
	}
