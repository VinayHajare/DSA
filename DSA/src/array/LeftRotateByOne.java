package array;

import java.util.Arrays;

/**
 Given an array 'arr' containing 'n' elements, rotate this array left once
 and return it.
 Rotating the array left by one means shifting all elements by one place to left and
 moving the first element to the last position in the array. 
*/
public class LeftRotateByOne {
	
	// Time-complexity : O(n)
	private static void rotateArray(int[] arr, int n) {
		int temp = arr[0];
		
		for(int i=1; i<n; i++) {
			arr[i-1] = arr[i];
		}
		
		arr[n-1] = temp;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		rotateArray(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
