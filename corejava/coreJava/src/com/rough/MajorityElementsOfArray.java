package com.rough;

import java.util.HashMap;


public class MajorityElementsOfArray {

	private static void findMajority(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				count = map.get(arr[i]) + 1;
				map.put(arr[i], count);
			} else {
				map.put(arr[i], 1);
			}
			if (map.get(arr[i]) > arr.length / 2) {
				System.out.println("Majority found :- " + arr[i]);
				return;
			}
		}
		System.out.println(" No Majority element");
	}

	/* Driver program to test the above functions */
	public static void main(String[] args) {
		int a[] = new int[] {2,2,2,2,5,5,5,5,5,5,5,5,2,2,2,2,2,2,2,3,3};
		findMajority(a);
	}
}
