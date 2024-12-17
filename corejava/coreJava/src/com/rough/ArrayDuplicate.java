package com.rough;

public class ArrayDuplicate {
	
	public static void main(String[] args) {
		boolean flag = false;
		
		int[] arr = {2,3,1,2,3,5};
		
		for(int i=0;i <arr.length;i++) {
			int abs_value = Math.abs(arr[i]);
			if(arr[abs_value-1] >0) {
				arr[abs_value-1] = -arr[abs_value-1];
			}else {
				System.out.println(abs_value);
				flag = true;
			}
		}
		if(!flag) {
			System.out.println(-1);
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > 0) {
				System.out.println(i+1);
			}
		}
 	}

}
