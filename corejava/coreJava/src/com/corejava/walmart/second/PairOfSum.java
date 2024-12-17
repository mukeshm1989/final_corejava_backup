package com.corejava.walmart.second;

public class PairOfSum {
public static void main(String[] args) {
    int[] arr = {2,4,5,1,2,8};
    int sum = 6;
    for(int i=0; i<arr.length-1; i++) {
    	int x = arr[i];
    	int index =i+1;
    	if(x+arr[index]== sum) {
    		System.out.println("(" + x + ", " + arr[index] + ")");
    		index++;
    	}
    }
}
}
