package array;

import java.util.Arrays;

/**
 Given an array 'arr' with 'n' elements, the task is to rotate the arrayto the left by 'k' steps,
 where 'k' is non-negative. 
*/

public class LeftRotateByK {

	// Brute-force approach - Time-complexity : O(n) Space-Complexity : O(k)
	private static void rotateArray(int[] arr, int n, int k) {
		k = k % n;
		
		int[] temp = new int[k]; 
		
		for(int i=0; i<k; i++) {
			temp[i] = arr[i];
		}
		
		for(int i=k; i<n; i++) {
			arr[i-k] = arr[i];
		}
		
		int j=0;
		for(int i=n-k; i<n; i++) {
			arr[i] = temp[j++]; // arr[i] = temp[i-(n-k)]
		}	
	}
	
	// Optimal solution - Time-complexity : O(2n) Space-Complexity : O(1) 
	private static void rotateArray(int[] arr, int k) {
		k = k % arr.length;
		reverse(arr, 0, k-1);
		reverse(arr, k,arr.length-1);
		reverse(arr, 0, arr.length-1);
	}
	
	private static void reverse(int[] arr, int start, int end) {
		while(start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		rotateArray(arr, arr.length, 14);
		System.out.println(Arrays.toString(arr));
	}

}
