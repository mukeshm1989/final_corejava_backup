package com.interview.rough;

import java.util.PriorityQueue;

public class KthSmallestNumber {
	public static void main(String[] args)
    {
        int[] arr = { 12, 3, 5, 7, 19 };
        int n = arr.length;
        int k = 4;
        System.out.println("The " + k
                           + "th smallest element is "
                           + kthSmallest(arr, n, k));
    }

	public static int kthSmallest(int[] arr,int n,int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->b-a);
		
		for(int i=0;i<arr.length;i++) {
			pq.offer(arr[i]);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		
		return pq.peek();
		
	}
	
}
