package array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 	There is an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
	Without altering the relative order of positive and negative numbers, 
	you must return an array of alternative positive and negative values.
	Note:
	Start the array with a positive number. 
	For example
	Input:
	A = [1, 2, -4, -5], N = 4
	Output:
	1 -4  2 -5
 */

public class AlternateNumbers {
	
	// Brute force solution with TC : O(n) + O(n/2) SC : O(n)
	private static int[] alternateNumbers(int[] arr) {
		int n = arr.length;
		List<Integer> positive = new ArrayList<Integer>();
		List<Integer> negative =  new ArrayList<Integer>();
		
		for(int num : arr) {
			if(num > 0) {
				positive.add(num);
			}else {
				negative.add(num);
			}
		}
		
		for(int i = 0; i<n/2; i++) {
			arr[2*i] = positive.get(i);
			arr[2*i+1] = negative.get(i);
		}
		
		return arr;
	}
	
    // Optimal solution with TC = O(n) SC : O(n)
	private static int[] alternateNumbers(int[] arr, int n) {
		int posIndex = 0;
		int negIndex = 1;
		int[] ans = new int[n];
		for(int i = 0; i<n; i++) {
			if(arr[i] > 0) {
				ans[posIndex] = arr[i];
				posIndex += 2;
			}else {
				ans[negIndex] = arr[i];
				negIndex += 2;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int a[] = {1, 2, -4, -5};
		System.out.println(Arrays.toString(alternateNumbers(a, a.length)));
		System.out.println(Arrays.toString(alternateNumbers(a)));
	}

}
