package com.corejava.basicPractice;

import java.util.Arrays;

public class KeyPair {
	public static void main(String args[])
    {
        int A[] = { 1, 4, 45, 6, 10, -8,  12 };
        int n = 16;
        int arr_size = A.length;

        // Function calling
        if (hasArrayTwoCandidates(A, arr_size, n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
	
	public static boolean hasArrayTwoCandidates(int[] arr,int size,int summ) {
		
		Arrays.sort(arr);
		int low =0;
		int high = size-1;
		while(low<high) {
			if(arr[low]+arr[high] == summ) {
				System.out.println(arr[low]+"," + arr[high]);
				return true;
			}else if(arr[low]+arr[high] < summ) {
				low++;
			}else {
				high--;
			}
		}
		return false;
	}

}
