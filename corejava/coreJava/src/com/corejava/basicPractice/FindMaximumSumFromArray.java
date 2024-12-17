package com.corejava.basicPractice;

public class FindMaximumSumFromArray {
	public static void main(String[] args) {
		int arrr[] = {17,0,-8,17,60,40,70,30};
		int sum = 0;
		int j=0;
		int count =0;
		for(int i=1;i<arrr.length;i++) {
			int x = arrr[j];
			if(x+arrr[i]>sum) {
				sum = x+arrr[i];
				count =i;
			}
			if(x<arrr[i]) {
				count = j;
				j = i;
			}
		}
		
		System.out.println("Sum = "+sum);
		System.out.println("Indexes are  = "+ count + ","+ j);
	}

}
