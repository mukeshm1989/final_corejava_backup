package com.corejava.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitString {
	
	public static void main(String[] args) {
		String str = "testmukeshmTest";
		String input ="test";
		
		String reges = "(?i)"+input;
		Pattern pattern = Pattern.compile(reges);
		Matcher matcher = pattern.matcher(str);
		int count=0;
		while (matcher.find()) {
			count++;
		}
		
		System.out.println(count);
	}
}
