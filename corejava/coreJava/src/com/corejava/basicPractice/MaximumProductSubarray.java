package com.corejava.basicPractice;

public class MaximumProductSubarray {
	public static void main(String[] args)
    {
        int arr[] = { 1, -2, -3, 0, 7, -8, -2 };
        System.out.println("Maximum Sub array product is "
                           + maxSubarrayProduct(arr));
    }

	public static int maxSubarrayProduct(int[] arr) {
		
		int ans = Integer.MIN_VALUE;
		int leftToRight = 1;
		int rightToLeft = 1;
		
		for(int i=0;i<arr.length;i++) {
			if(leftToRight == 0)
				leftToRight =1;
			if(rightToLeft == 0)
				rightToLeft =1;
			
			leftToRight = leftToRight*arr[i];
			rightToLeft = rightToLeft*arr[(arr.length-1)-i];
			
			ans = Math.max(Math.max(rightToLeft, leftToRight), ans);
		}
		return  ans;
	}
}
