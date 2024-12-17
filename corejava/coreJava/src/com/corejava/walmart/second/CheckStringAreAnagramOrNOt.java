package com.corejava.walmart.second;

import java.util.Arrays;

public class CheckStringAreAnagramOrNOt {
	public static void main(String[] args) {
        String str1 = "geeksforgeeks";
        String str2 = "forgeeksgeeks";
        
        char arr[] = str1.toCharArray();
        char arr1[] = str2.toCharArray();
        
        if(str1.length()!= str2.length()) {
            System.out.print("The two strings are not "
                    + "anagram of each other");
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        
        for(int i=0;i<arr.length;i++) {
        	if(arr[i] != arr1[i]) {
        		System.out.print("The two strings are not "
                        + "anagram of each other");	
        	}
        }
        System.out.print("The two strings are "
                + "anagram of each other");
	}

}
