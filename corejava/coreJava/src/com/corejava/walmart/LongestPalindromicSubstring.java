package com.corejava.walmart;

public class LongestPalindromicSubstring {
	public static void main(String[] args) {
        String input1 = "babad";
        String input2 = "cbbd";
        System.out.println("Longest Palindromic Substring of '" + input1 + "': " + longestPalindrome(input1));
        System.out.println("Longest Palindromic Substring of '" + input2 + "': " + longestPalindrome(input2));
    }

    // Method to find the longest palindromic substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return ""; // Check for null or empty string
        int start = 0, end = 0; // Variables to mark the start and end of the longest palindrome

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i); // Length of palindrome for odd length
            int len2 = expandFromCenter(s, i, i + 1); // Length of palindrome for even length
            int len = Math.max(len1, len2); // Maximum length from the two cases

            if (len > end - start) { // Update start and end if a longer palindrome is found
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1); // Return the longest palindromic substring
    }

    // Helper method to expand around the center and find palindrome length
    private static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Length of the palindrome
    }

}
