package test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(10, "rtest");
		map.put(8, "stest");
		map.put(20, "etest");
		map.put(6, "atest");

		Map<String, Integer> wordCounts = new HashMap<>();
		wordCounts.put("orange", 6);
		wordCounts.put("apple", 5);
		wordCounts.put("banana", 3);
		wordCounts.put("cherry", 7);

//        wordCounts.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(
//				Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o1,o2)->o1,LinkedHashMap:: new));
//        wordCounts.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(
//				Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o1,o2)->o2,LinkedHashMap:: new));

		HashMap<String, Integer> temp = wordCounts.entrySet().stream()
				.sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));

		System.out.println(temp);
//        for (Map.Entry<String, Integer> entry :
//        	temp.entrySet()) {
//           System.out.println("Key = " + entry.getKey()
//                              + ", Value = "
//                              + entry.getValue());
//       }

//        Thread t1 = new Thread(() -> 
//        System.out.println(Thread.currentThread().getName()));
//        t1.start();
//        t1.run();
	}

}
