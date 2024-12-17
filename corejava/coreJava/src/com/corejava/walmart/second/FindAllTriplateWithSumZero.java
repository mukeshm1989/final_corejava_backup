package com.corejava.walmart.second;

public class FindAllTriplateWithSumZero {
	public static void main(String[] args) {
		int arr[] = {0, -1, 2, -3, 1};
		for(int i=0; i<arr.length-1;i++) {
			int left = i+1;
			int right = arr.length-1;
			int x = arr[i];
			
			if(x+arr[left]+arr[right] == 0) {
				System.out.println(x+","+ arr[left]+"," +arr[right]);
				left++;
				right--;
			}else if(x+arr[left]+arr[right]<0) {
				left++;
			}else {
				right--;
			}
		}
	}

}
