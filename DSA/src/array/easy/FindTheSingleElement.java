package array.easy;

import java.util.HashMap;
import java.util.Map;

/***
 	You are given a sorted array 'arr' of positive integers of size 'n'.
	It contains each number exactly twice except for one number, which occurs exactly once.
 	Find the number that occurs exactly once.

	Example :
	Input: ‘arr’ = {1, 1, 2, 3, 3, 4, 4}.
	Output: 2
*/

public class FindTheSingleElement {

	// brute force approach TC: O(n*n) SC: O(1)
	private static int getSingleElement(int[] arr, int n) {
		for(int i = 0; i<n; i++) {
			int num = arr[i];
			int count = 0;
			for(int j=0; j<n; j++) {
				if(arr[j] == num) {
					count++;
				}
			}
			if(count == 1) {
				return num;
			}
		}
		return -1;
	}
	
	// better solution with TC: O(n) SC: O(n/2+1)
	private static int findSingleElement(int arr[], int n) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : arr) {
			map.put(num, map.getOrDefault(num,0)+1);
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return -1;
	}
	
	// optimal solution with TC : O(n) SC: O(1)
	private static int getSingleElementWithXOR(int[] arr, int n) {
		int xor = 0;
		for(int num : arr) {
			xor = xor ^ num;
		}
		return xor;
	}
	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 3, 3, 4, 4};
		System.out.println(getSingleElement(arr, arr.length));
		System.out.println(findSingleElement(arr, arr.length));
		System.out.println(getSingleElementWithXOR(arr, arr.length));
	}

}
