package array.medium;

import java.util.HashMap;
import java.util.Map;

/**
 	You are given an array 'a' of 'n' integers.
	A majority element in the array ‘a’ is an element that appears more than 'n' / 2 times.
	Find the majority element of the array.
	It is guaranteed that the array 'a' always has a majority element.
	Example:
	Input: ‘n’ = 9, ‘a’ = [2, 2, 1, 3, 1, 1, 3, 1, 1]
	Output: 1
*/

public class MajorityElement {
	
	// brute force solution with TC : O(n^2) SC : O(1)
	private static int majorityElement(int[] arr, int n) {
		for(int i = 0; i<n; i++) {
			int count = 0;
			for(int j = 0; j<n; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count > n/2) {
				return arr[i];
			}
		}
		return -1;
	}
	
	// better solution with TC : O(2n) SC : O(n)
 	private static int majorityElement(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > arr.length/2) {
				return entry.getKey();
			}
		}
		
		return -1;
	}
 	
 	// optimal solution using moore's voting algorithm with TC : O(n) SC : O(1)
 	private static int getMajorityElement(int[] arr) {
 		int count = 0;
 		int element = -1;
 		for(int i = 0; i<arr.length; i++) {
 			if(count == 0) {
 				count = 1;
 				element = arr[i];
 			}else if(arr[i] == element) {
 				count++;
 			}else {
 				count--;
 			}
 		}
 		
 		// if the problem doesn't state that array contains majority or not then verify by a single iteration
 		int counter = 0;
 		for(int i = 0; i<arr.length; i++) {
 			if(arr[i] == element) {
 				counter++;
 			}
 		}
 		if(counter > arr.length/2) {
 			return element;
 		}
 		
 		return -1;
 	}
	public static void main(String[] args) {
		int arr[] = {2, 2, 1, 3, 1, 1, 3, 1, 1};
		System.out.println(majorityElement(arr, arr.length));
		System.out.println(majorityElement(arr));
		System.out.println(getMajorityElement(arr));
	}
}
