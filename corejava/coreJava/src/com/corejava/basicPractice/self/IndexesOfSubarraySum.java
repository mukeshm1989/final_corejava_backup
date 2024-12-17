package com.corejava.basicPractice.self;

import java.util.ArrayList;

public class IndexesOfSubarraySum {
	
	
	public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        int sum = 1;
        ArrayList<Integer> res = subarraySum(arr, n, sum);
        for (int i : res)
            System.out.print(i + " ");
    }

	
	public static ArrayList<Integer> subarraySum(int[] arr, int n, int sum) {
		
		int currentSum = 0;
		int last = 0;
		int start = 0;
		boolean flag = false;
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			currentSum = currentSum+arr[i];
			if(currentSum>=sum) {
				last = i;
			}
			
			while(sum<currentSum && start<last) {
				currentSum = currentSum-arr[start];
				start++;
			}
			
			if(currentSum == sum) {
				res.add(start);
				res.add(last);
				flag = true;
				break;
			}
			
		}
		if(!flag) {
			res.add(-1);
		}
		
		return res;
		
	}
}
