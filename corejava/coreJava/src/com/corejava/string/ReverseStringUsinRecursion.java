package com.corejava.string;

public class ReverseStringUsinRecursion {
	public static int index=0;
	public static String result = "";
	public static void main(String[] args) {
		String str = "mukesh";
		String resultString = reverseString(str);
		System.out.println(resultString);
	}
	public static String reverseString(String str) {
			if(index<str.length()) {
				index++;
			if(index%2==1) {
				result =str.charAt(index)+result;
				reverseString(str);
	}else {
		reverseString(str);
	}
	}
		return result;
	}
}