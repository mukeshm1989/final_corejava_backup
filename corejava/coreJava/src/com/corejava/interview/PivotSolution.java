package com.corejava.interview;

public class PivotSolution {
	
	public static int pivotIndex(int[] nums) {
		
        if (nums.length == 0) {
            return -1;
        }
        
        int leftSum = 0;
        int rightSum = 0;
        
        for (int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            // if leftSum == rightSum, then we have found the pivot index
            if (leftSum == rightSum) {
                return i;
            }
            
            // update leftSum and rightSum
            leftSum += nums[i];
            if (i + 1 < nums.length) {
                rightSum -= nums[i + 1];
            }
        }
        
        // if we get to this point, then there is no pivot index
        return -1;
    }
	
	public static void main(String[] args) {
		
		int arr[] = {1,3,5,2,2};
		
		System.out.println(pivotIndex(arr));
	}
}
