package array.easy;

import java.util.HashMap;
import java.util.Map;

/**
	You are given an array 'a' of size 'n' and an integer 'k'.
	Find the length of the longest subarray of 'a' whose sum is equal to 'k'.
	Example :
	Input: ‘n’ = 7 ‘k’ = 3
	‘a’ = [1, 2, 3, 1, 1, 1, 1]
	Output: 3
*/

public class LongestSubarrayWithSumK {

	// Brute force solution with TC: O(n^3) SC: O(1)
	private static int findLengthOfLongestSubarray(int arr[], int k) {
		int maxLength = 0, n = arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				int sum = 0;
				for(int m=i; m<=j; m++) {
					sum += arr[m];
				}
				if(sum == k) {
					maxLength = Math.max(maxLength, j-i+1);
				}
			}
		}
		
		return maxLength;
	}
	
	// brute force optimized with TC: O(n^2) SC:(1)
	private static int findLengthOfLongestSubarray(int arr[], int k, int n) {
		int maxLength = 0;
		for(int i=0; i<n; i++) {
			int sum = 0;
			for(int j=i; j<n; j++) {
				sum += arr[j];
				if(sum == k) {
					maxLength = Math.max(maxLength, j-i+1);
				}
			}
		}
		return maxLength;		
	}
	
	// Better solution with TC : O(n) SC : O(n), it is better solution if array has negative, zero or positive
	private static int longestSubarrayWithSumK(int arr[], int k) {
		int maxLength = 0;
		int sum = 0;
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
			
			if(sum == k) {
				maxLength = Math.max(maxLength, i+1);
			}
			
			int remaining = sum - k;
			if(map.containsKey(remaining)) {
				int length = i - map.get(remaining);
				maxLength = Math.max(maxLength, length);
			}
			
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
		}
		
		return maxLength;
	}
	
	// Optimal solution with TC : O(2n) SC : O(1)
	private static int longestSubarrayWithSumK(int[] arr, int k, int n) {
		int left = 0, right = 0;
		int sum = 0;
		int maxLength = 0;
		
		while(right < n) {
			sum += arr[right];
			
			while(left <= right && sum > k) {
				sum -= arr[left];
				left++;
			}
			
			if(sum == k) {
				maxLength = Math.max(maxLength, right-left+1);
			}
			right++;
		}
		return maxLength;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 1, 1, 1, 1};
		System.out.println(findLengthOfLongestSubarray(arr, 4));
		System.out.println(findLengthOfLongestSubarray(arr, 4, arr.length));
		System.out.println(longestSubarrayWithSumK(arr, 4));
		System.out.println(longestSubarrayWithSumK(arr, 4, arr.length));
	}

}
