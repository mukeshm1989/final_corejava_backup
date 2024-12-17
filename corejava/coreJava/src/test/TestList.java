package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(list);
		System.out.println(set);
		
		list.addAll(set);
		
		System.out.println(list);
	}

}
