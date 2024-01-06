package basic.recursion;

import java.util.Arrays;

/**
 * Given an array 'arr' of size 'n'.
 * return an array with all the elements placed in reverse order
 */
public class ReverseArray {

	private static int[] reverse(int arr[]) {
		reverseArray(0, arr.length-1, arr);
		return arr;
	}
	private static void reverseArray(int i, int length, int[] arr) {
		if( i >= length) {
			return;
		}
		swap(i, length, arr);
		reverseArray(i+1, length-1, arr);
	}
	private static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = ReverseArray.reverse(new int[]{1,2,3,4,5});
		System.out.println(Arrays.toString(arr));
	}

}
