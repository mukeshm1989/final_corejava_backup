package com.corejava.basicPractice;

public class SeprateZeroNonZeroFromArray {
	
	public static void main(String[] args) {
		
		int arr[] = {3,1,0,2,0,4,5};
		
		int resultArray[] = new int[arr.length];
		int k=0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>0) {
				resultArray[k++] =arr[i];
			}
		}
		
//		for(int i=0;i<resultArray.length;i++) {
//			System.out.print(resultArray[i]+" ");
//		}
		
		int newArr[] = {1,3,0,4,0,5,0};
		int newk =0;
		for(int i=0;i<newArr.length;i++) {
			if(newArr[i]>0) {
				newArr[newk++] = newArr[i];
			}
		}
		while (newk<newArr.length) {
			newArr[newk++] = 0;
		}
		for(int i=0;i<newArr.length;i++) {
			System.out.print(newArr[i]+" ");
		}
		
	}

}
