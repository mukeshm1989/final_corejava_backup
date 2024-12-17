package com.corejava.basicPractice;

public class RemoveStringAndCountString {
	
	public static void main(String[] args) {
		String str = "mishra going to mishra";
		// input is mishra
		int count =0;
		String result ="";
		
		String[] strchar = str.split("\\s+");
		
		for(String test : strchar) {
			if(str.equalsIgnoreCase(test)) {
				count++;
				continue;
			}else {
				result = result+test;
			}
		}
		System.out.println(result);
		System.out.println(count);
		
	}

}
