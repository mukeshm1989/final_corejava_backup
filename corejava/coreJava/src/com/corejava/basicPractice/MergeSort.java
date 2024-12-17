package com.corejava.basicPractice;

public class MergeSort {

	public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given array is");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        printArray(arr);
    }
	
	public static void sort(int arr[],int low,int high) {
		
		if(low<high) {
			int mid = (low+high)/2;
			sort(arr,low,mid);
			sort(arr,mid+1,high);
			mergeSort(arr,low,mid,high);
		}	
	}
	
	public static void mergeSort(int arr[],int low,int mid,int high) {
		
		// get the size of two array.
		
		int LfarraySize = mid-low+1;
		int RsArray = high-mid;
		
		
		int[] LfirstArray = new int[LfarraySize];
		int[] RsecondArray = new int[RsArray];
		
		
		for(int i=0;i<LfarraySize;i++) {
			LfirstArray[i] = arr[low+i];
		}
		
		for(int j=0;j<RsArray;j++) {
			RsecondArray[j] = arr[mid+1+j];
		}
		
		int i = 0,j =0;
		int k =low;
		
		while (i<LfarraySize && j<RsArray) {
			if(LfirstArray[i]<=RsecondArray[j]) {
				arr[k] =LfirstArray[i];
				i++;
			}else {
				arr[k] =RsecondArray[j];
				j++;
			}
			k++;
		}
			while (i<LfarraySize) {
				arr[k] = LfirstArray[i];
				i++;
				k++;	
			}
			while (j<RsArray) {
				arr[k] = RsecondArray[j];
				j++;
				k++;	
			}
		}
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
