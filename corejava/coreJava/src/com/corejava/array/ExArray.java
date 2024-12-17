package com.corejava.array;

public class ExArray {
public static void main(String[] args) {
	int array[] = {1,0,2,3,1,2,0,4};
	int c=0;
	
    for (int i = 0; i < array.length; i++) 
        if (array[i] != 0) 
        	array[c++] = array[i]; 

    while (c < array.length) 
    	array[c++] = 0;

	for (int i = 0; i < array.length; i++) 
     System.out.println(array[i]);
}
}