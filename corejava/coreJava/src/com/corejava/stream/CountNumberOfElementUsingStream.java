package com.corejava.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNumberOfElementUsingStream {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(2);
	list.add(1);
	list.add(10);
	list.add(10);
	
	
	ConcurrentMap<Integer, Long> map = list.stream().collect(Collectors.groupingByConcurrent(x->x, Collectors.counting()));
	//List<Integer> list1 = list.stream().sorted(Comparator.comparingInt().reversed()).
		//	collect(Collectors.toList());
	
	
	list.stream().sorted(Comparator.comparing(Function.identity())).forEach(System.out::println);
	System.out.print(list);
	
}
}
