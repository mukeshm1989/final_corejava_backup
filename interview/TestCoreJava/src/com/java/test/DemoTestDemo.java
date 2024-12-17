package com.java.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DemoTestDemo {
	public static void main(String[] args) {
		int[] arr= {1,2,2,3,4,5,6,7,7,8,9,9,10,11,11,12,13,13,12,134,145,14,14,14};
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		int count =0; 
		Map<Integer,Integer> testMap = new HashMap<Integer, Integer>();
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				testMap.put(entry.getKey(), count);
				count++;
			}
		}
		for(Entry<Integer, Integer> entry : testMap.entrySet()) {
			if(entry.getValue()==count-1) {
				System.out.println(entry.getKey());
				
			}
		}
	}

}
