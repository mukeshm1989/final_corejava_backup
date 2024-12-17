package com.rough.second;

import java.util.ArrayList;

public class SubArrayIndex {
	
	public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int n = arr.length;
        int sum = 12;
        ArrayList<Integer> res = subarraySum(arr, n, sum);
        for (int i : res)
            System.out.print(i + " ");
    }
	
	public static ArrayList<Integer> subarraySum(int arr[],int n,int sum) {
		int last =0;
		int start =0;
		int currentSum =0;
		boolean flag =false;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++) {
			currentSum+=arr[i];
			if(currentSum>=sum) {
				last =i;
			}
			while(sum<currentSum && start<last) {
				currentSum= currentSum-arr[start];
				start++;
			}
			if(currentSum==sum) {
				list.add(start+1);
				list.add(last+1);
				flag = true;
				break;
			}
		}
		if(!flag) {
			list.add(-1);
		}
		return list;
	}

}
