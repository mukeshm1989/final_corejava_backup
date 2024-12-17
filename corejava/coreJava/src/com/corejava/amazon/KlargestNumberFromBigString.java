package com.corejava.amazon;


public class KlargestNumberFromBigString {
	public static void main(String[] args) {
        int[] arr = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96};
        int N = arr.length;
        int k = 3;

        // For Largest
        kthLargest(arr, 0, N - 1, k, N);

        // Print K Largest numbers
        System.out.print(k + " largest elements are: ");
        for (int i = N - 1; i >= N - k; i--)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
	public static void kthLargest(int arr[],int low,int high,int k,int arraySize) {
		
		int pos = priotitation(arr,low,high);
		
		if(pos-1==k-1) {
			return;
		}
		
		else if(pos- 1 < k-1) {
			kthLargest(arr, pos+1, high, k-pos+low-1, arraySize);
		}else {
			kthLargest(arr, low, pos-1, k, arraySize);
		}
	}
	
	public static int priotitation(int arr[],int low,int high) {
		
		int pivot = arr[high];
		int i = low-1;
		
		for (int j=low;j<=high-1;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return i+1;
		
	}
	
	public static void swap(int arr[], int i, int j) {
		int temp =arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}