package com.corejava.basicPractice.self;

public class ArrayDuplicateInJava {
	
	public static void main(String[] args) {
		//int arr[] = {2,3,1,2,3};
		int arr[] = {4,3,1,2};
		boolean flag = false;
		for(int i=0;i<arr.length;i++) {
			int abs_value = Math.abs(arr[i]);
			if(arr[abs_value-1] > 0 ) {
				arr[abs_value-1] = -arr[abs_value-1];
			}else {
				flag = true;
				System.out.println(abs_value);
			}
		}
		if(!flag) {
			System.out.println("-1");
		}
	}

}
