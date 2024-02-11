package array.easy;

/*
* You have been given an array 'arr' of 'n' unique non-negative integers.
* Find the smallest element from the array.
*/

public class SmallestElement {

	private static int smallestElement(int arr[], int n) {
		int smallestElement = arr[0];
		for(int i = 1; i<n; i++) {
			if(arr[i] < smallestElement) {
				smallestElement = arr[i];
			}
		}
		return smallestElement;
	}
	
	public static void main(String[] args) {
		int[] arr = {13 , 45, 67, 6, 12};
		System.out.println(smallestElement(arr, arr.length));
	}

}
