package com.java.test;

import java.util.stream.IntStream;

public class Test {
	
	public static void main(String[] args) {
		
		//0/p={0,0,0,0,9,6,5,-1}
		
		int[] input = {9,6,0,0,5,0,-1,0};
		int count = 0;
		int[] nonZero = new int[input.length];
		int key=0;
		int[] array =  {1,5,7,-1};
		int sum =6;
		int n = input.length;
		int countA =0;
		int k =0;
		for(int i=0;i<input.length;i++) {
			if(input[i]==0) {
				input[countA++] = 0;
			}else {
				nonZero[k++] =input[i];
			}
		}
		
		for(int i=k;i<input.length;i++) {
			input[i] =nonZero[key++];
		}
		
		
		for(int i=0;i<array.length;i++) {
			for (int j=i+1;j<array.length;j++) {
				if(array[i]+array[j]==sum) {
					count++;
					System.out.println(array[i]+","+array[j]);
				}
			}
		}
		
//		List<String> list = Arrays.asList("banana", "apple", "cherry");
//		  list.stream()
//		      .sorted((s1, s2) -> s1.compareTo(s2))
//		      .forEach(System.out::println);
//		System.out.println(count);
		
//		IntStream.range(1, 6)
//        .mapToObj(i -> i + " ")
//        .forEach(System.out::print);
//		for(int i = 0;i<input.length;i++) {
//			System.out.println(input[i]);
//		}
	}

}
