package com.corejava.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyExample {
    public static void main(String[] args) {
        String input = "This is an example string with several words and this is a test";

        // Split the string by whitespace
        String[] words = input.split("\\s+");

        // Count the frequency of each word using streams
       Map<String, Long> wordCount =  Arrays.stream(words).map(String::toLowerCase) // Optional: normalize to lowercase
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print the word frequencies
        wordCount.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}