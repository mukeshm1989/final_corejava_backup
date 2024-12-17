package com.java.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TestExample {
	
	public static void main(String[] args) {
		
		removeStringGivenInput();
	}

	private static void removeStringGivenInput() {
		String str = "jungleWelcometoJuNgLe";
		String input ="jungle";
		String pattern = "(?i)"+input;
		String str1 = str.replaceAll(pattern, "");
		System.out.println(str1);        
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(str);
        int count = 0;
        while(matcher.find()) {
        	count++;
        }
        System.out.println("jungle : "+ count);
	}
}
