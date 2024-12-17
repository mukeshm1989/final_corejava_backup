package com.corejava.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ExStream {
	public static void main(String[] args) {
	List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 4);
	Set<Integer> duplicated = numbers
	  .stream()
	  .filter(n -> numbers
	        .stream()
	        .filter(x -> x == n)
	        .count() > 1)
	   .collect(Collectors.toSet());	
	System.out.println(duplicated);
		
	// InputStream.of(numbers).distinct(2).toList();
	
	List<Integer> list = numbers.stream().distinct().collect(Collectors.toList());
	System.out.println(list);
}
}
