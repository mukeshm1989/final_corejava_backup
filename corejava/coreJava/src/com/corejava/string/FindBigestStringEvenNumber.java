package com.corejava.string;

import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindBigestStringEvenNumber {
	
	public static void main(String[] args) {
		
		String str = "Be not afarid of";
		int maxLength = 0;
		String evenLengthStr = "";
		StringTokenizer stk = new StringTokenizer(str);
		while (stk.hasMoreElements()) {
			String object =  (String) stk.nextElement();
			if(object.length()%2==0) {
				int strLength = object.length();
				if(maxLength<strLength) {
					maxLength=strLength;
					evenLengthStr = object;
				}
			}
		}
		System.out.println(evenLengthStr);
		
		String str1 = "mukesh , Kumar , Mishra";
		String str2 = str1.replace(",", " ");
		StringTokenizer strk = new StringTokenizer(str2);
		while (strk.hasMoreElements()) {
			String object = (String) strk.nextElement();
			System.out.println(object);
		}
		String input ="mukesh";
		String input1 = Stream.of(input.split("")).sorted().collect(Collectors.joining());
		System.out.println(input1);
	}
}
