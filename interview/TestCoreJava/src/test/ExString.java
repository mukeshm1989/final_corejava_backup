package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExString {
	public static void main(String[] args) {
		
//		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(2);
//		list.add(6);
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		int sum = 0;
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)%2==0) {
				sum =  (int) (sum + Math.pow(list.get(i), 2));
			}
		}
		
		System.out.println(sum); // 4+16 = 24;
		int arr[] = {1,5,3,50,4};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
			System.out.println(arr[i]);
		}
		quickSort(arr);
		
	}
	
	public static void quickSort(int[] arr) {
		int low = 0;
		int high = arr.length;
		if(low<high) {
			int pov = partitation(arr,low,high);
		}
	}

	public static int partitation(int[] arr,int low,int high) {		
		int pivot = arr[high];
		int i = low-0;
		//while(pivot<arr[])
		return high;
	}
}