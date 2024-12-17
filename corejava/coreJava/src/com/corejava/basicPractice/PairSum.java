package com.corejava.basicPractice;

import java.util.HashMap;
import java.util.Map;

public class PairSum {
	
    static void printPairs(int[] arr, int n, int sum) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int rem = sum - arr[i];
            if(m.containsKey(rem) && !m.containsKey(arr[i])) {
            	System.out.println("(" + rem + ", " + arr[i] + ")");
            }
            m.put(arr[i], 1); 
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,1,2,8};
        int n = arr.length;
        int sum = 6;
        printPairs(arr, n, sum);
    }

}
