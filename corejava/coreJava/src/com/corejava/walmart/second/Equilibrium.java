package com.corejava.walmart.second;

public class Equilibrium {
	
	public static void main(String[] args) {
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
		
		int sum =0;
		int leftSum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			sum= sum-arr[i];
			if(sum==leftSum) {
				System.out.println("Index = "+ i);
				break;
			}
			leftSum= leftSum+arr[i];
		}
	}

}
