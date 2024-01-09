package sorting;

import java.util.Arrays;

/**
 * Sort the given unsorted array 'arr' of size 'n' in non-decreasing order using the bubble sort algorithm.
 */
public class BubbleSort {

	//  Time complexity : O(n^2) for worst/average case
	private static void bubbleSort(int[] arr){
		// for each element
		for(int i =0; i<arr.length; i++) {
			for(int j = 0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	//  for best-case O(n)
	private static void optimizedBubbleSort(int[] arr) {
		for(int i=arr.length-1; i>0; i--) {
			boolean didSwap = false;
			for(int j=0; j<=i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					didSwap = true;
				}
				if(!didSwap) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {6,5,4,3,2,1};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		optimizedBubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
