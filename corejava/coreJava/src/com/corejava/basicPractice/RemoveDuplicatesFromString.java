package com.corejava.basicPractice;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesFromString {
	
	static String removeDuplicates(char []s,int n){
		  Map<Character,Integer> exists = new HashMap<>();

		  String st = "";
		  for(int i = 0; i < n; i++){
		    if(!exists.containsKey(s[i]))
		    {
		      st += s[i];
		      exists.put(s[i], 1);
		    }
		  }
		  return st;
		}

		// driver code
		public static void main(String[] args){
		  char s[] = "geeksforgeeks".toCharArray();
		  int n = s.length;
		  System.out.print(removeDuplicates(s,n));
		}

}
