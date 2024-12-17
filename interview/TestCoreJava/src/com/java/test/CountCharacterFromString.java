package com.java.test;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterFromString {
	public static void main(String[] args) {
		String str = "mukeshmk";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			if(map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
				
			}else {
				map.put(ch[i], 1);
			}
		}	
		map.entrySet().stream().filter(m->m.getValue()>1).forEach(System.out::println);
	}

}
