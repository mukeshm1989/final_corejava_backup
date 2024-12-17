package com.java.test;

public class InterviewTest {
	
	// reverse the integer sign   
	
	//int num  = 123;
	// int num  = -123;
	// sample out = 321,  -321
	public static void main(String[] args) {
		int num = -2147483648;
		//System.out.println(Integer.MAX_VALUE);
		int result = reverseInteger(num);
		System.out.println(result);
	}
	
	public static int reverseInteger(int num) {
		
		int n = -6/2;
		System.out.println(n);
		
		boolean flag= false;
		int result = 0;
		while(num>0) {
			int temp;
			temp = num%10;
			num = num/10;
			result = result*10+temp;
			if(result<0) {
				return 0;
			}
		}
		return result;
		}
		///  -6/2 = 3
}
