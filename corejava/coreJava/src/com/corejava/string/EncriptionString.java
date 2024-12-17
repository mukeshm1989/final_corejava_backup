package com.corejava.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EncriptionString {
	
	public static void main(String[] args) {
		String str = "A3B5C7";
		String result = "";
		char ch[] = str.toCharArray();
		String regex = "a,b,c,d,e,f,A,B,C,D,E,F";
		for(int i=0;i<ch.length;i++) {
			if(matchCharReegex(ch[i] ,regex)) {
				result = result+ch[i];
			}else  {
				int number = Integer.parseInt(String.valueOf(ch[i]));
				for(int j = 0;j<number-1;j++) {
					result = result + ch[i-1];
					}
				}
		}
		System.out.println(result);
	}
	
	public static boolean matchCharReegex(char c,String regex) {
		Pattern pattern = Pattern.compile(String.valueOf(c));
		Matcher m = pattern.matcher(regex);
		if(m.find()) {
			return true;
		}
		return false;
		
	}

}
