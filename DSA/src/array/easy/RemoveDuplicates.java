package array.easy;

import java.util.HashSet;
import java.util.Set;

/**
  You are given a sorted integer array 'arr' of size 'n'.
  You need to remove the duplicates from the array such that each element appears
  only once.
  Return the length of this new array.
 */
public class RemoveDuplicates {
	
	// Brute-force approach- Time-Complexity: O(n) Space-complexity: O(n)
	private static int removeDuplicates(int[] arr, int n) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i<n; i++) {
			set.add(arr[i]);
		}
		
		int i = 0;
		for(int element : set) {
			arr[i++] = element;
		}
		return i;
	}
	
	// Optimal Approach- Time-Complexity: O(n) Space-Complexity: O(1)
	private static int removeDuplicates(int[] arr) {
		int i = 0;
		for(int j = 1; j<arr.length; j++) {
			if(arr[i] != arr[j]) {
				arr[i+1] = arr[j];
				i++;
			}
		}
		return i+1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 6, 7, 7, 8};
		System.out.println(removeDuplicates(arr, arr.length));
		System.out.println(removeDuplicates(arr));
	}

}
