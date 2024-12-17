package com.corejava.string;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencePratice {
	public static void main(String[] args) {
		
		String str = "mkmk";
		char ch[] = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (Character c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		map.forEach((k,v)->{
			System.out.println("Vlaue : "+ k + " Count : "+ v);
		});
		String word = "Mukesh Kumar Mihsra Mukesh";
		
		String words[] = word.split("\\s+");
		
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		
		for(String wrd : words) {
			if(wordMap.containsKey(wrd)) {
				wordMap.put(wrd, wordMap.get(wrd)+1);
			}else {
				wordMap.put(wrd, 1);
			}
		}
		
		wordMap.forEach((k,v)-> {
			if(v>1) {
				System.out.println("Vlaue : "+ k + " Count : "+ v);
			}
		});
	}

}
