package array;

/**
 * You have been given an array 'arr' of 'n' unique non-negative integers.
 * Find the second largest element from the array.
 */
public class SecondLargestElement {

	// brute-force solution : Time-Complexity : O(2n)
	private static int secondLargestElement(int[] arr) {
		int largest = arr[0];
		int secondLargest = -1;
		for(int i=1; i<arr.length; i++) {
			if(largest < arr[i]) {
				largest = arr[i];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>secondLargest && arr[i]<largest) {
				secondLargest = arr[i];
			}
		}
		
		return secondLargest;
	}
	
	// Optimal Solution: Time-complexity : O(n)
	private static int secondLargestElement(int[] arr, int n) {
		int secondLargestElement = Integer.MIN_VALUE, largestElement = arr[0];
		
		for(int i=1; i<n; i++) {
			if(largestElement < arr[i]) {
				secondLargestElement = largestElement;
				largestElement = arr[i];
			}else if(arr[i] < largestElement && arr[i] > secondLargestElement){
				secondLargestElement = arr[i];
			}
		}
		return secondLargestElement;
	}
	
	public static void main(String[] args) {
		int[] arr = {24, 34, 583, 46, 7};
		System.out.println(secondLargestElement(arr));
		System.out.println(secondLargestElement(arr, arr.length));
	}

}
