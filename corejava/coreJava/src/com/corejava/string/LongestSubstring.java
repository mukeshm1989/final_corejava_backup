package com.corejava.string;

import java.util.HashMap;

public class LongestSubstring {
	
	static int longestUniqueSubsttr(String str) {
        int n = str.length();
        int res = 0; // result
        int i = 0;

        // Creating a hash map to store the last positions of occurrence
        HashMap<Character, Integer> lastIndex = new HashMap<>();

        // Starting from the beginning of the string
        for (int j = 0; j < n; j++) {
            // If this character is seen before, then update i
            if (lastIndex.containsKey(str.charAt(j))) {
                i = Math.max(i, lastIndex.get(str.charAt(j)) + 1);
            }

            // Update result if needed
            res = Math.max(res, j - i + 1);

            // Update the last occurrence of the current character
            lastIndex.put(str.charAt(j), j);
        }
        return res;
    }

    // Driver code
    public static void main(String[] args) {
        String str1 = "ABCDEFGABEFJ";
        System.out.println("Length of the longest substring without repeating characters: " + longestUniqueSubsttr(str1));

        String str2 = "GEEKSFORGEEKS";
        System.out.println("Length of the longest substring without repeating characters: " + longestUniqueSubsttr(str2));
    }

}
