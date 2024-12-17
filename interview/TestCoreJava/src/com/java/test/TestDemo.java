package com.java.test;

import java.util.Arrays; 

public class TestDemo {
	
//	public boolean detectLoop(Node h, List<> list) {
//		
//		Node pre;
//		
//		Node current = h;
//		
//		while(h != null) {
//			if(pre.= lis.nxt) {
//				true;	
//			}
//		}
//	}
	
	
	//static int index;
	public static void main(String[] args) {	
	
	int arr[]= {12, 11, -13, -5, 6, -7, 5, -3, -6};// {-4,-6,1,3};  //{-4,-6,1,3}
//	int arr[] = {1, 7, -5, 9, -12, 15};
	//int arr1[] = seprateArrayWithnegativeAndPositive(arr,arr.length,0,0,0);
	int index=0;
	for(int i=0;i<arr.length;i++) {
		int temp;
		if(arr[i]<0) {
			temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
			index++;
		}
 	}
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}
	
//	for(int i = 0; i<arr1.length;i++) {
//		System.out.println(arr1[i]);
//	}
//	}
	
//	public static int[] seprateArrayWithnegativeAndPositive(int arr[],int n,int index,int i,int j) {
//		int length = arr.length;
//		int temp;
//		if(length>j) {
//			if(arr[i] < 0) {
//				temp = arr[index];
//				arr[index] = arr[i];
//				arr[i] = temp;
//				index++;
//			}
//			i++;
//			j++;
//			seprateArrayWithnegativeAndPositive(arr,length,index,i,j);
//		}
//		return arr;
//		
//	}
	
	
//	public static void main(String[] args) {
//		
//		int arr[] = {900, 940, 950, 1100, 1500, 1800};
//		int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
//		
//		int n = arr.length-1;
//		
//		int platfromRequired = platforRequired(arr,dep,n);
//		System.out.println(platfromRequired);
//	}
	
	public static int platforRequired(int[] arr,int[] dep,int n) {
		
		int result = 1; 
		int platform_required = 1;
		int i=1;
		int j=0;
		Arrays.sort(arr);
		Arrays.sort(dep);
		while(i<n && j<n) {
			if(arr[i]<=dep[j]) {
				platform_required++;
				i++;
			}else if(dep[j]<arr[i]) {
				platform_required--;
				j++;
			}
			if(platform_required>result) {
				result = platform_required;
			}
		}
		return result;
		
	}
}
 