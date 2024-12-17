package com.interview.rough;

import java.util.Arrays;

public class LongestCommonPrefix {
	public static void main(String[] args){
        String[] strs = { "geeksforgeeks", "geeks", "geek",
                          "geezer" };
        System.out.println("The longest common prefix is: "
                           + longestCommonPrefix(strs));
    }
	
	private static String  longestCommonPrefix(String[] strs) {
		
		if(strs==null || strs.length==0) {
			return null;
		}
		Arrays.sort(strs);
		
		String first = strs[0];
		String last = strs[strs.length-1];
		int i=0;
		int minLength = Math.min(first.length(), last.length());
		while(i<minLength && first.charAt(i)== last.charAt(i)) {
			i++;
		}
		return first.substring(0,i);
	}
}
