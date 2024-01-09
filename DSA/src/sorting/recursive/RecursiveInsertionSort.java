package sorting.recursive;

import java.util.Arrays;

/**
 * You are given an array 'arr' of size 'n'. You must sort this array using insertion sort recursively.
 */

public class RecursiveInsertionSort {

	// Time-complexity : O(n)
	private static void insertionSort(int[] arr, int i, int n) {
		if(i == n) return;
		int j = i;
		while( j > 0 && arr[j-1] > arr[j]) {
			int temp = arr[j];
			arr[j] = arr[j-1];
			arr[j-1] = temp;
			j--;
		}
		insertionSort(arr, i+1, n);
	}
	
	public static void main(String[] args) {
		int[] arr = {78, 89, 0, 1, 2};
		insertionSort(arr, 0, arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
