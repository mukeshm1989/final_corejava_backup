package com.corejava.amazon.google;

import java.util.PriorityQueue;

public class KthSmallestNumbers {
	
	public static int kthSmallest(int[] arr, int N, int K) {
        // Create a max heap (priority queue)
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        // Iterate through the array elements
        for (int i = 0; i < N; i++) {
            // Push the current element onto the max heap
            pq.offer(arr[i]);

            // If the size of the max heap exceeds K, remove the largest element
            if (pq.size() > K)
                pq.poll();
        }

        // Return the Kth smallest element (top of the max heap)
        return pq.peek();
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 12, 3, 5, 7, 19 };
        int n = arr.length;
        int k = 3;
        System.out.println("The " + k
                           + "th smallest element is "
                           + kthSmallest(arr, n, k));
    }

}
