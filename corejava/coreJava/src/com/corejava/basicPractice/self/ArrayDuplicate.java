package com.corejava.basicPractice.self;

import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicate {
	//Input: arr[] = {0,3,1,2}, n = 4
	//		Output: -1
	//		Explanation: There is no repeating element in the array. Therefore output is -1.
	public static void main(String[] args) {
		int[] arr = {0,3,1,2,2,3};
		
		findDuplicateValue(arr);
		
		//System.out.println(duplicateValue);
		
	}
	
	public static void findDuplicateValue(int[] arr) {
		
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		map.forEach((k,v)->{
			if(v>1) {
				System.out.print(k + " ");
			}
		});
	}

}
