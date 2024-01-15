package sorting;

import java.util.Arrays;

/**
	You are given an array 'arr' of size 'n'.
	Sort the given array using heap sort.
	Time-Complexity : O(nlogn)
	Space-Complexity : O(1)
*/

public class HeapSort {
	
	// Time-Complexity : O(logn)
	private static void heapify(int[] arr, int n, int i) {
		int largest = i;
		int leftChild = 2*i+1;
		int rightChild = 2*i+2;
		
		if(leftChild < n && arr[leftChild] > arr[largest]) {
			largest = leftChild;
		}
		
		if(rightChild < n && arr[rightChild] > arr[largest]) {
			largest = rightChild;
		}
		
		if(i != largest) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, n, largest);
		}
	}
	
    // Time-Complexity : O(nlogn) Space-Complexity : O(1)
	private static void heapSort(int[] arr, int n) {
		
		// Build the max heap using the array takes O(n)
		for(int i = (n/2)-1; i>=0; i--) {
			heapify(arr, n, i);
		}
		
		// Delete the max element from the heap and sort the array takes O(logn)
		for(int i=n-1; i>0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}

	public static void main(String[] args) {
		int[] arr = {45, 67, 9, 20, 10, 11};
		heapSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
}
