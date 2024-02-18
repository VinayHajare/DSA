package array.medium;

import java.util.Arrays;

/**
 You have been given an array/list 'arr' consisting of 'n' elements.
 Each element in the array is either 0, 1 or 2.
 Sort this array/list in increasing order.
 Do not make a new array/list. Make changes in the given array/list.
 Example :
 Input: 'arr' = [2, 2, 2, 2, 0, 0, 1, 0]

 Output: Final 'arr' = [0, 0, 0, 1, 2, 2, 2, 2]
 */
public class SortArrayOf0s1sand2s {

	// Brute force solution with TC : O(nlogn) SC : O(1)
	private static void sortArray(int arr[]) {
		Arrays.sort(arr);
	}
	
	// Better solution with TC : O(2n) SC : O(1)
	private static void sortArray(int arr[], int n) {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == 0) {
				count0++;
			}else if(arr[i] == 1) {
				count1++;
			}else {
				count2++;
			}
		}
		
		for(int i = 0; i < count0; i++) {
			arr[i] = 0;
		}
		
		for(int i = count0; i < count0+count1; i++) {
			arr[i] = 1;
		}
		
		for(int i = count0+count1; i < n; i++) {
			arr[i] = 2;
		}
	}
	
	// Optimal Solution using Dutch national flag with TC: O(n) SC: O(1)
	private static void sortArrayOptimized(int arr[], int n) {
		int low = 0, mid = 0, high = n-1;
		
		while(mid <= high) {
			if(arr[mid] == 0) {
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			}else if(arr[mid] == 1) {
				mid++;
			}else {
				int temp = arr[high];
				arr[high] = arr[mid];
				arr[mid] = temp;
				high--;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 2, 2, 2, 0, 0, 1, 0};
		sortArrayOptimized(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
