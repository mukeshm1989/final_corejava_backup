package com.corejava.amazon.google;

public class KthLargestElements {
    
    // Function to swap two integers
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // Partition the array around the last element and get the position of the pivot element in the sorted array
    static int partition(int[] arr, int l, int r) {
        int x = arr[r];
        int i = l;
        for (int j = l; j <= r - 1; j++) {
            if (arr[j] <= x) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, r);
        return i;
    }

    // This function stops at the K'th largest element in arr[l..r] using QuickSort-based method
    static void kthLargest(int[] arr, int l, int r, int k, int N) {
        // Partition the array around the last element and get the position of the pivot element in the sorted array
        int pos = partition(arr, l, r);

        // If the position is the same as k
        if (pos - l == k - 1)
            return;

        // If the position is less, recurse for the right subarray
        else if (pos - l < k - 1)
            kthLargest(arr, pos + 1, r, k - pos + l - 1, N);

        // Else, recurse for the left subarray
        else
            kthLargest(arr, l, pos - 1, k, N);
    }

    public static void main(String[] args) {
        int[] arr = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
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
}