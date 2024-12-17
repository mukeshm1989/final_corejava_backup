package com.corejava.array;

import java.util.HashSet;
import java.util.Set;

public class PrintAllPairForGivenSum {

	public static void printPairs(int[] arr, int n, int sum)
    {
        int count = 0; // Initialize result
        Set<String> dup = new HashSet<>();

        // Consider all possible pairs and check their sums
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == sum) {
                    String pair1 = arr[i] + "," + arr[j];
                    String pair2 = arr[j] + "," + arr[i];

                    if (!dup.contains(pair1)
                        && !dup.contains(pair2)) {
                        System.out.println("(" + arr[i]
                                           + ", " + arr[j]
                                           + ")");
                        dup.add(pair1);
                    }
                }
            }
        }
    }

    // Driver function to test the above function
    public static void main(String[] args)
    {
        int[] arr = { 1, 5, 7, -1, 5 };
        int n = arr.length;
        int sum = 6;
        printPairs(arr, n, sum);
    }
}
