package com.java.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JungleCount {
	    public static void main(String[] args) {
	        String input = "jungleWelcometoJuNgLe";
	        String wordToFind = "jungle";
	        String regex = "(?i)" + wordToFind;
	        int count = countOccurrences(input, wordToFind);
	        System.out.println(input.replaceAll(regex, ""));
	        System.out.println("Number of times '" + wordToFind + "' appears: " + count);
	    }
	    
	    public static int countOccurrences(String input, String wordToFind) {
	        String regex = "(?i)" + wordToFind;
	        int count = 0;
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(input);
	        while (matcher.find()) {
	            count++;
	        }
	        return count;
	    }
	}
