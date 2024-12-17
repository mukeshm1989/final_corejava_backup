package com.corejava.walmart.self;

public class MatchReghtAndElftString {
	
	public static void main(String[] args) {
		String str = "RLRRLLRLRL";

		
		int result = balancedStringSplit(str);
		System.out.println(result);
	}
	
	public static int balancedStringSplit(String str) {
		int n =0,l=0;
		for(char c: str.toCharArray()) {
			
			if(c=='L') {
				l++;
			}else {
				--l;
			}if(l==0) {
				n++;
			}
		}
		
		return n;
		
	}

}
