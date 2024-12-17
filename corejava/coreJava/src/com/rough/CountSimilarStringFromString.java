package com.rough;

public class CountSimilarStringFromString {
	
	public static void main(String[] args) {
		String str = "RLRRLLRLRL";
		
		char[] ch = str.toCharArray();
		int left = 0;
		int ans=0;
		for(int i=0; i < ch.length; i++) {
			if(ch[i] == 'L') {
				left++;
			}else {
				left--;
			}if(left == 0) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
