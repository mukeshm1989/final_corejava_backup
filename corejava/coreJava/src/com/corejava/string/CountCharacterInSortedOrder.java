package com.corejava.string;

public class CountCharacterInSortedOrder {
	
	public static void main(String[] args) {
		String str = "mukeshmishra";
		
		str.chars().sorted().forEach(System.out::println);;
	}

}
