package com.corejava.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "mukesh";
		char ch[] =  str.toCharArray();
		String rstring = "";
		char arr[] = str.toCharArray();
		int n = arr.length;
		for(int i =0;i<n;i++) {
			char c = arr[i];
			rstring = c+rstring;
		}
		System.out.println(rstring);
		
		
		String input = "Java is great and fun";

        // Call the method to reverse each word using streams
        String result = reverseString(input);
        
        System.out.println("result :"+ result);

	}
	
	public static String reverseString(String input) {
		
		return Arrays.stream(input.split("\\s+")).map(word -> new StringBuilder(word).reverse()).collect(
				Collectors.joining(" "));
	}

}
