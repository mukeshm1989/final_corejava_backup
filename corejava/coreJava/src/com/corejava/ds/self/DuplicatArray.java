package com.corejava.ds.self;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DuplicatArray {

	public static void main(String[] args) {
		int[] arr = {8,3,8,4,5,3};
		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x->x, Collectors.counting())).forEach(
				(k,v)->{
					if(v>1) {
						System.out.println("Key"+k+"Value:"+v);
					}
				});
		
	}
	
}
