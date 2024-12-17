package com.rough;

import java.util.HashMap;
import java.util.Map;

public class LongestContiniousSubString {
	public static void main(String[] args) {
		String str = "abcdefghabc";
		int result = 0;
		int i = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int j=0; j<str.length(); j++) {
			if(map.containsKey(str.charAt(j))) {
				i = Math.max(i, map.get(str.charAt(j))+1);
			}
			result = Math.max(result, j-i+1);
			map.put(str.charAt(j), j);
		}
		System.out.println(result);
	}

}
