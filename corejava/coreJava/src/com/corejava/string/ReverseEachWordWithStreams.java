package com.corejava.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordWithStreams {
    public static void main(String[] args) {
        String input = "Java is great and fun";

        // Call the method to reverse each word using streams
        String result = reverseString(input);

        // Print the result
        System.out.println("Original String: " + input);
        System.out.println("String with each word reversed using streams: " + result);
    }

    // Method to reverse each word in the string using streams
    public static String reverseWords(String input) {
        return Arrays.stream(input.split("\\s+"))
                     .map(word -> new StringBuilder(word).reverse().toString())
                     .collect(Collectors.joining(" "));
    }
    
    public static String reverseString(String input) {
    	
    	return Arrays.stream(input.split("\\s+")).map(word -> 
    	new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
    	
    }
}
