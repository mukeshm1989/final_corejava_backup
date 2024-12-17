package test;

import java.util.ArrayList;
import java.util.List;

public class Optum {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		List<Integer> list = Optum.printSquareOfNumber(arr);
		System.out.println(list);
	}
	
	private static List<Integer>  printSquareOfNumber(int[] arr){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			int square = arr[i]*arr[i];
			//list.add(square);
			int square1 =  (int) Math.pow(arr[i], 3);
			list.add(square1);
		}
		return list;
	}
}
