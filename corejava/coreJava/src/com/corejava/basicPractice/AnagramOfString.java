package com.corejava.basicPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AnagramOfString {
	
	public static void main(String[] args)
    {
        String str1 = "geeksforgeeks";
        String str2 = "sorreeksgeeks";
 
        // Function call
        if (areAnagram(str1, str2))
            System.out.print("The two strings are "
                             + "anagram of each other");
        else
            System.out.print("The two strings are "
                             + "not anagram of each other");
    }
	
	public static boolean areAnagram(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<str1.length();i++) {
			
			if(map.containsKey(str1.charAt(i))) {
				map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
			}else {
				map.put(str1.charAt(i), 1);
			}
		}
		
		for(int i=0;i<str2.length();i++) {
			if(map.containsKey(str2.charAt(i))) {
				map.put(str2.charAt(i), map.get(str2.charAt(i))-1);
			}
		}
		
		
		for(Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()!=0) {
				return false;
			}
		}
		return true;
//		Set<Character> keys = map.keySet();
//        for (Character key : keys) {
//            if (map.get(key) != 0) {
//                return false;
//            }
//        }
//        // Returning True as all keys are zero
//        return true;
	}
}
