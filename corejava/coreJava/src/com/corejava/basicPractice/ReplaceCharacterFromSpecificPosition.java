package com.corejava.basicPractice;

public class ReplaceCharacterFromSpecificPosition {
	public static void main(String[] args) {
		String str ="MukeshKumarMishra";
		int index = 6;
		char ch = 'r';
		
		String strResult = str.substring(0, index)+ch+str.substring(index+1);
		System.out.println(strResult);
	}

}
