package array;

/**
 * Given an array 'arr' of size 'n', find the largest element in the array.
 */

public class LargestElement {

	private static int largestElement(int[] arr, int n) {
		int largestElement = arr[0];
		for(int i=1; i<n; i++) {
			if(largestElement < arr[i]) {
				largestElement = arr[i];
			}
		}
		return largestElement;
	}
	
	public static void main(String[] args) {
		int[] arr = {24, 34, 583, 46, 7};
		System.out.println(largestElement(arr, arr.length));
	}

}
