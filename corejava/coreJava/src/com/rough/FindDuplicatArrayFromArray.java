package com.rough;

import java.util.ArrayList;
// Wrong
public class FindDuplicatArrayFromArray {
	
	static void findDuplicates( 
		      int arr[], int len) 
		    {  
		        boolean ifPresent = false;  
		        ArrayList<Integer> al = new ArrayList<Integer>(); 
		  
		        for (int i = 0; i < len - 1; i++) {  
		                    if (al.contains(arr[i])) { 
		                        break; 
		                    } 
		                    else if(al.isEmpty()){ 
		                        al.add(arr[i]); 
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
