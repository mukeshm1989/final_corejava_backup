package com.rough;

public class LongestPalidrom {
	
	public static void main(String[] args) {
		
		String str = "babad";
		String result = longestPalidrom(str);
		System.out.println(result);
	}
	
	public static String longestPalidrom(String str) {
		
		if(str == null || str.length() < 1) {
			
			return "";
		}
		int start =0,end =0;
		
		for(int i=0; i<str.length(); i++) {
			int lenght1  = expendFromCenter(str,i,i);
			int lenght2  = expendFromCenter(str,i,i+1);
			int len = Math.max(lenght1, lenght2);
			
			if(len> end -start) {
				start = i-(len-1)/2;
				end = i + len/2;
			}
	
		}
		return str.substring(start,end+1);
	}
	
	public static int expendFromCenter(String str,int left,int right) {
		
		while(left>=0 && right < str.length() && str.charAt(right) == str.charAt(left)) {
			left--;
			right++;
		}
		return right-left-1;
		
	}

}
