package com.corejava.array;

import java.util.ArrayList;

public class FindDuplicateArray {

	static void findDuplicates( 
		      int arr[], int len) 
		    {  
		        boolean ifPresent = false;  
		        ArrayList<Integer> al = new ArrayList<Integer>(); 
		  
		        for (int i = 0; i < len - 1; i++) { 
		            for (int j = i + 1; j < len; j++) { 
		                if (arr[i] == arr[j]) {  
		                    if (al.contains(arr[i])) { 
		                        break; 
		                    } 
		                    else { 
		                        al.add(arr[i]); 
		                        ifPresent = true; 
		                    } 
		                } 
		            } 
		        } 
		        if (ifPresent == true) { 
		  
		            System.out.print("Duplicate Found" + al + " "); 
		        } 
		        else { 
		            System.out.print( 
		                "No duplicates present in arrays"); 
		        } 
		    } 
		    public static void main(String[] args) 
		    { 
		  
		        int arr[] = { 12, 11, 40, 12, 5, 6, 5, 12, 11,12 }; 
		        int n = arr.length; 
		  
		        findDuplicates(arr, n); 
		    } 
}
