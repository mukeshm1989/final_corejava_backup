package com.corejava.walmart;

public class LongestPalindromicSubstringSelf {
	public static void main(String[] args) {
		
		String str = "babad";
		
		String result = longestPalidromString(str);
		System.out.println("Longest Palidrom String is : "+result);
	}
	
	public static String longestPalidromString(String str) {
		
		if(str==null || str.length()<1) {
			return "";
		}
		int start =0,end =0;
		
		for(int i=0;i<str.length();i++) {
			int length1 = expendFromCenter(str,i,i);
			int length2 = expendFromCenter(str,i,i+1);
			int len = Math.max(length1, length2);
			
			if(len>end-start) {
				start = i-(len-1)/2;
				end = i+len/2;
			}
		}
		
		return str.substring(start,end+1);
		
	}

	public static int expendFromCenter(String str,int left,int right) {
		while(left>=0 && right <str.length() && str.charAt(right) == str.charAt(left)) {
			left--;
			right++;
		}
		return right-left-1;
	}
}
