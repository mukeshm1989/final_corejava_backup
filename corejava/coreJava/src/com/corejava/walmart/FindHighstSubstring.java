package com.corejava.walmart;

import java.util.HashMap;
import java.util.Map;

public class FindHighstSubstring {
	
	public static void main(String[] args) {
		//ABCDEFGABEFJ
		String str = "abcdefgabef";
		int count = countHighstSubString(str);
		System.out.println(count);
	}
	
	public static int countHighstSubString(String str) {
		
		int i =0;
		int res = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int j=0;j<str.length();j++) {
			if(map.containsKey(str.charAt(j))) {
				i = Math.max(i, map.get(str.charAt(j))+1);
			}
			res = Math.max(res, j-i+1);
			map.put(str.charAt(j), j);
		}
		return res;
	}

}


