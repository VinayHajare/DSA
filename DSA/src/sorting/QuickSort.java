package sorting;

import java.util.Arrays;

/**
 * Given a 'start' and 'end' index positions of the array 'input'.
 * Your task is to sort the elements between start and end using quick sort.
 */

public class QuickSort {

	private static void quickSort(int[] arr, int low, int high) {
		if(low < high) {
			int partitionIndex = partition(arr, low, high);
			quickSort(arr, low, partitionIndex-1);
			quickSort(arr, partitionIndex+1, high);
		}
	}
	
	private static int partition(int[] arr, int low, int high) {
		int pivot = low;
		int i = low;
		int j = high;
		
		while(i < j) {
			while( arr[i] <= arr[pivot] && i <= high) {
				i++;
			}
			while( arr[j] > arr[pivot] && j >= low) {
				j--;
			}
			if(i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[j];
		arr[j] = arr[pivot];
		arr[pivot] = temp;
		return j;
	}

	public static void main(String[] args) {
		int arr[] = {2, 6, 8, 5, 4};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
