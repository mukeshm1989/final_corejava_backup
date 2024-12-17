package com.java.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountStringFromWord {
	
	public static void main(String[] args) {
		String str = "mukeshKumarMishraMukesh";
		
		String input = "mukesh";
		String pattern = "(?i)"+input;
		String result = str.replaceAll(pattern,"");
		System.out.println(result);
		Pattern pattern1  = Pattern.compile(pattern);
		Matcher matcher = pattern1.matcher(str);
		int count =0;
		while(matcher.find()) {
			count++;
		}
		System.out.println("Mukesh : "+ count);
	}

}
