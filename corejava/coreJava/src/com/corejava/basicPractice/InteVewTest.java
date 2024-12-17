package com.corejava.basicPractice;

public class InteVewTest {

	
	static void remove(String str, String word)
    {
        // Split the string using split() method
        String msg[] = str.split("\\s+");
        String new_str = "";
        int count =0;
        for (String words : msg) {
            if (!words.equalsIgnoreCase(word)) {
 
                // Concat the word not equal to the given
                // word
            	new_str = new_str  + words + " ";
               // new_str += words + " ";
            }else {
            	count++;
            }
        }
 
        // Print the new String
        System.out.print(new_str);
        System.out.println(count);
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Custom string as input
        String str = "This is the Geeks For geeks";
 
        // Word to be removed from above string
        String word = "Geeks";
 
        // Calling the method 1 by passing both strings to
        // it
        remove(str, word);
    }
}
