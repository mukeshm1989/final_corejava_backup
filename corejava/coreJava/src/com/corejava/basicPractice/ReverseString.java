package com.corejava.basicPractice;

public class ReverseString {
	public static void main(String[] args) {
		String str ="mukesh";
		char ch[] = str.toCharArray();
		String result = "";
		for(int i=0;i<ch.length;i++) {
			result = ch[i]+result;
		}
		System.out.println(result);
	}

}
