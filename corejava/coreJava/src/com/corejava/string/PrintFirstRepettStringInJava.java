package com.corejava.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintFirstRepettStringInJava {
	
	public static void main(String[] args) {
		String str = "shyamkumaryadav";
		
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		
		/*
		 * map.forEach((key,value) ->{ if(value>1) { System.out.println("Key :" +key +
		 * ",  Value" +value); return; } });
		 */
		
		for(Map.Entry<Character,Integer> en : map.entrySet()) {
			if(en.getValue()>1) {
				System.out.println("Key :" +en.getKey() + ",  Value" +en.getValue());
				break;
			}
		}
		//System.out.println("tets");
	}

}
