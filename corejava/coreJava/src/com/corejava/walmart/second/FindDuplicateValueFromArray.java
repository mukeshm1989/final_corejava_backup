package com.corejava.walmart.second;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateValueFromArray {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,2,4,4,5,6,6};
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		for(Entry<Integer, Integer> entry :map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
		}
	}

}
