package sorting;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * You are given the starting 'i' and the ending 'r' positions of the array 'arr'.
 * You must sort the elements between 'i' & 'r'
 */

public class MergeSort {

	// Time-complexity : O(nlogn) Space-Complexity : O(n)
	private static void mergeSort(int[] arr, int low, int high) {
		// base condition for recursion, array contains only one element.
		if(low >= high) {
			return;
		}
		
		int mid = (low + high)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merge(arr, low, mid, high);
	}
	
	private static void merge(int[] arr, int low, int mid, int high) {
		// temporary storage for merging arrays
		List<Integer> temp = new ArrayList<Integer>();
		int left = low, right = mid+1;
		
		// merging and adding the array element in sorted order until one array got exhausted
		while(left <= mid && right <= high) {
			if(arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			}else {
				temp.add(arr[right]);
				right++;
			}
		}
		
		// adding the remaining elements in the temporary array list
		while(left <= mid) {
			temp.add(arr[left]);
			left++;
		}
		
		while(right <= high) {
			temp.add(arr[right]);
			right++;
		}
		
		// adding the elements from temporary list to original array
		for(int i = low; i<=high; i++) {
			arr[i] = temp.get(i-low);
		}
	}

	public static void main(String[] args) {
		int arr[] = {2, 13, 4, 1, 3, 4, 6, 28};
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

}
