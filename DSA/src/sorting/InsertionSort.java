package sorting;

import java.util.Arrays;

/**
 * Sort the given unsorted array 'arr' of size 'n' in non-decreasing order using the selection sort algorithm.
 */

public class InsertionSort {
	
	// Time-complexity : O(n^2)
	private static void insertionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int j = i;
			while(j > 0 && arr[j-1] > arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] temp = {2, 13, 4, 1, 3, 6, 28};
		insertionSort(temp);
		System.out.println(Arrays.toString(temp));
	}
}
