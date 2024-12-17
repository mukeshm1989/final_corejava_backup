package com.rough;

import java.util.ArrayList;

public class IndexesofSubarraySum {
	
	public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int n = arr.length;
        int sum = 12;
        ArrayList<Integer> res = subarraySum(arr, n, sum);
        for (int i : res)
            System.out.print(i + " ");
    }
	
	public static ArrayList<Integer> subarraySum(int[] arr, int n,int sum) {
		
		int last = 0;
		int start = 0;
		long curSum  = 0;
		boolean flag = false;
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		for(int i = 0;i<n;i++) {
			curSum += arr[i];
			
			if(curSum>=sum) {
				last =i;
			}
			while (sum < curSum && start < last) {
				curSum-= arr[start];
				++start;
			}
			if(curSum == sum) {
				res.add(start+1);
				res.add(last+1);
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
