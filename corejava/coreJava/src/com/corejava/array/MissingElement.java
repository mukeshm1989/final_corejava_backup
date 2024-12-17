package com.corejava.array;

public class MissingElement {
	
	public static int getMissingNo(int[] nums, int n)
    {
       int sum = 0;
       int N = n+1;
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
        }
        System.out.println(N);
        System.out.println(sum);
        return ((N * (N+1))/2 - sum);
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4,5,7 };
        int N = arr.length;
        System.out.println("Length" + N);
        System.out.println(getMissingNo(arr, N));
    }

}
