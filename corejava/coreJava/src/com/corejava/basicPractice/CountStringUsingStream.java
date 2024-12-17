package com.corejava.basicPractice;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class CountStringUsingStream {

	public static void main(String[] args) {
		String str = "mukeshmishra";
		
		char[] ch = str.toCharArray();
		
		LinkedHashSet<Character> lch = new LinkedHashSet<Character>();
		
		for(int i =0;i< ch.length;i++) {
			lch.add(ch[i]);
		}
		
		str= str.toLowerCase();
		
		str.chars().boxed()
		.collect(Collectors.groupingBy((c->(char)c.intValue()),LinkedHashMap::new ,Collectors.counting())).
		forEach((k,v)->{
			if(v>1) {
			System.out.println("Key: "+k + " Vlaue : "+v);
			}
		});;
	}
}
