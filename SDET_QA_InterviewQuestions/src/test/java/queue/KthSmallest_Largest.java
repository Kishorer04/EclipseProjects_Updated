package queue;

import java.util.Collections;
import java.util.PriorityQueue;

/*
Given an integer array arr[] and k. Find the k'th smallest element in the given array.
Note: k is always smaller than the size of the array.

[Expected Approach] Using Max-Heap - O(n * log(k)) Time and O(k) Space
The idea is to maintain a max heap of size k while iterating through the array. The heap always contains the k smallest elements seen so far. 
If the heap size exceeds k, remove the largest element. At the end, the heap holds the k smallest elements. 
*/

public class KthSmallest_Largest {

	static int kthSmallest(int[] arr, int k) {

		// Create a Max Heap
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		// Iterate through the array
		for (int val : arr) {
			// Push the current element onto the Max Heap
			pq.add(val);

			// If the size of the Max Heap exceeds k, remove the largest element
			if (pq.size() > k)
				pq.poll();
		}

		// Return the kth smallest element (top of the Max Heap)
		return pq.peek();

	}

	static int kthLargest(int[] arr, int k) {

		// Create a Min Heap
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		// Iterate through the array
		for (int val : arr) {
			// Push the current element onto the Min Heap
			pq.add(val);

			// If the size of the Min Heap exceeds k, remove the largest element
			if (pq.size() > k)
				pq.poll();
		}

		// Return the kth largest element (top of the Min Heap)
		return pq.peek();

	}

	public static void main(String[] args) {

		int[] arr = { 4, 5, 3, 8, 1, 9, 6, 5 };
		int k = 3;
		int smallest = kthSmallest(arr, k);
		System.out.println(smallest);

		int largest = kthLargest(arr, k);
		System.out.println(largest);

	}
}
