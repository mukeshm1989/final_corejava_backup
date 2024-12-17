package com.corejava.basicPractice;

public class MaxJumpInArray {

	public static void main(String[] args)
	        throws java.lang.Exception
	    {
	 
	        // Inputs
	        int N = 9;
	        int A[] = { 20, 16, 13, 9, 17, 11, 15, 8, 7 };
	 
	        // Function call
	        min_jumps(N, A);
	    }
	    public static void min_jumps(int N, int A[])
	    {
	 
	        // Variable to store the maximum element
	        // and the number of jumps
	        int max = -1, count = 0;
	        for (int i = N - 1; i > 0; i--) {
	            if (A[i] > max) {
	                max = A[i];
	                count++;
	            }
	        }
	        // If it is impossible to reach
	        // the last element
	        if (A[0] < max)
	            count = -1;
	 
	        // Printing the minimum number
	        // of operations
	        System.out.println(count);
	    }
}
