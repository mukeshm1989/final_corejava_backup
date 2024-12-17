package com.corejava.stream;

import java.util.Arrays;

public class WordCountExample {
    public static void main(String[] args) {
        String input = "This is an example string with several words";

        // Split the string by whitespace and filter out empty strings
        long wordCount = Arrays.stream(input.split("\\s+"))
                               .filter(word -> !word.isEmpty())
                               .count();

        System.out.println("Word count: " + wordCount);
    }
}