package com.corejava.ds.sorting;


public class BubbleSort {
	
	public static void main(String[] args) {
		
		int  unsortedArray[] = {2,10,3,5,8,6,7,11};
		BubbleSort ob = new BubbleSort();
		ob.bubblesort(unsortedArray);
		ob.printArray(unsortedArray);
		
	}

	public void bubblesort(int []arr) {
		int n = arr.length;
		for(int i=0; i<n-1; i++) 
			for(int j=0; j<n-i-1; j++) 
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
	}
	
	public void printArray(int []arr) {
		int n = arr.length; 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
		
	}
}
