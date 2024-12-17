package com.rough.second;

import java.util.Arrays;

public class CountInversion {
public static void main(String[] args) {
		
		//int arr[] = {8, 4, 2, 1};
		
		int arr[] = {4, 8, 2, 1};
		
		// (8,4)(8,2)(8,1)(4,2)(4,1)(2,1)
		
		int low = 0;
		int high = arr.length-1;
		
		int count  = mergeSortAndCount(arr,low ,high);
		System.out.println(count);
	}

	public static int mergeSortAndCount(int arr[],int low,int high) {
		int count =0;
		if(low<high) {
			int mid = (low+high)/2;
			
			count+=mergeSortAndCount(arr, low, mid);
			count+=mergeSortAndCount(arr, mid+1, high);
			count+=mergeAndCount(arr,low,mid,high);
		}
		return count;
	}
	
	public static int mergeAndCount(int arr[],int low,int mid,int high) {
		int leftArr[] = Arrays.copyOfRange(arr, low, mid+1);
		int rightArr[] = Arrays.copyOfRange(arr, mid+1, high+1);
		
		int i=0,j=0,k=low,count=0;
		
		while(i < leftArr.length && j < rightArr.length) {
			if(leftArr[i] <= rightArr[j]) {
				arr[k++] = leftArr[i++];
			}else {
				arr[k++] = rightArr[j++];
				count+=(mid+1)-(low+i);
			}
		}
		while(i<leftArr.length) {
			arr[k++] = leftArr[i++];
		}
		while(j<rightArr.length) {
			arr[k++] = rightArr[j++];
		}
		return count;
 	}

}
