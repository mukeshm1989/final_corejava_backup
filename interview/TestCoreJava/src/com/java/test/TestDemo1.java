package com.java.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TestDemo1 {

	static int index;

	public static void main(String[] args) {

		String[] words = { "apple", "banana", "pear", "fig", "kiwi", "grape", "mango", "berry", "banana", "apple" };

		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		List<String> list = Arrays.asList(words);
		Map<Object, List<String>> testList = list.stream().collect(Collectors.groupingBy(word -> word.length()));

		System.out.println(testList);
		// LinkedHashMap.

		for (int i = 0; i < words.length; i++) {
			if (wordMap.containsKey(words[i])) {
				wordMap.put(words[i], wordMap.get(words[i]) + 1);
			} else {
				wordMap.put(words[i], 1);
			}
		}
		for (Entry<String, Integer> entry : wordMap.entrySet()) {
			if (entry.getValue() >= 2) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}
}
