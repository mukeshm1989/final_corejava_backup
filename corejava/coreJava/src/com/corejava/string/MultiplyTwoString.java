package com.corejava.string;

import java.math.BigInteger;

public class MultiplyTwoString {
	public static void main(String[] args) {
		String a = "1235421415454545454545454544";
	    String b = "1714546546546545454544548544544545";
	    
	    BigInteger num1 = new BigInteger(a);
	    BigInteger num2 = new BigInteger(b);
	    
	    BigInteger result = num1.multiply(num2);
	    System.out.println(result);
	}
	
}
