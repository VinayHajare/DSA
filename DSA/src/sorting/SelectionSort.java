package sorting;

import java.util.Arrays;

/**
 * Sort the given unsorted array 'arr' of size 'n' in non-decreasing order using the selection sort algorithm.
 */

public class SelectionSort {
	
	// Time-complexity : O(n^2)
	private static void selectionSort(int[] arr) {
		for(int i=0; i<=arr.length-2; i++) {
			int mini = i;
			
			for(int j=i; j<=arr.length-1; j++) {
				if(arr[j] < arr[i]) {
					mini = j;
				}
			}
			
			int temp = arr[mini];
			arr[mini] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {6,5,4,3,2,1};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
