package com.corejava.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class ListStreamSorting {

	public static void main(String[] args) {
		
		List<String> name = new ArrayList<String>();
		
		name.add("Mukesh");
		name.add("Kumar");
		name.add("Abhishek");
		name.add("Sanjay");
		List<String> sortesstList= name.stream().sorted((key1,key2)-> key1.compareTo(key2)).collect(Collectors.toList());
		List<String> sortesstList1= name.stream().sorted((key2,key1)-> key1.compareTo(key2)).collect(Collectors.toList());
		
		System.out.println(sortesstList);
		System.out.println(sortesstList1);
		
		name.stream().forEach(key->{
			if(key.equalsIgnoreCase("Mukesh")) {
				System.out.println(key);
			}
		});
	}
}
