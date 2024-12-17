package com.java.test;


// write a program to check whether given string is Palindrome or not

public class TestDemo2 {
	public static void main(String[] args) {
		String str = "tba";
		String res = "";
		
		for(int i = 0;i<str.length();i++) {
			res = str.charAt(i)+res;
		 }
		if(str.equals(res)) {
		System.out.println("String is palidrom ");
		}else {
			System.out.println("String is not palidrom ");
		}
	}
}
