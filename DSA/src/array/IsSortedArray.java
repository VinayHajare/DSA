package array;

/**
   You are given a sorted integer array 'arr' of size 'n' non-negative integers.
   You have to check whether the given array is sorted in the non-decreasing order or not.
   Your task is to return 1 if the given array is sorted. Else, return 0; 
 */

public class IsSortedArray {
	
	private static boolean isSorted(int[] arr, int n) {
		for(int i = 1; i<n; i++) {	
		    if(arr[i] >= arr[i-1] ) {
		    	
		    }else {
		    	return false;
		    }
		}
		return true;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 5, 6, 7, 7, 8};
		System.out.println(isSorted(arr, arr.length));
	}

}
