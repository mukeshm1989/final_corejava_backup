package com.interview.rough;

public class KLargestNumberFromArray {

	public static void main(String[] args) {
        int[] arr = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96};
        int N = arr.length;
        int k = 3;
        kthLargestNumber(arr,0,N-1,k,N);
        System.out.print(k + " largest elements are: ");
        for (int i = N - 1; i >= N - k; i--)
            System.out.print(arr[i] + " ");

        System.out.println();
	}
	
	public static void kthLargestNumber(int[] arr,int low,int high,int key,int arraySize) {
		
		if(low<high) {
			int pos = partitation(arr,low,high);
			if(pos-1==key-1) {
				return;
			}
			if(pos-1<key-1) {
				kthLargestNumber(arr,pos+1,high,key-pos+low-1,arraySize);
			}else {
				kthLargestNumber(arr,low,pos-1,key,arraySize);
			}
		}
		
	}
	
	public static int partitation(int[] arr,int low,int high) {
		int pivot = arr[high];
		int i = low-1;
		for(int j=low;j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return (i+1);
	}
	
	public static void swap(int[] arr,int i,int j) {
		int temp =arr[i];
		arr[j] = arr[i];
		arr[i] = temp;
	}
}
