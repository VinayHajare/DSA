package array.medium;

import java.util.HashMap;
import java.util.Map;

/*
 	You are given an integer array 'arr' of size 'N' and an integer 'K'.
	Your task is to find the total number of subarrays of the given array whose sum of elements is equal to k.
	A subarray is defined as a contiguous block of elements in the array.
	Example:
	Input: ‘N’ = 4, ‘arr’ = [3, 1, 2, 4], 'K' = 6
	Output: 2
*/

public class CountAllSubarraysWithGivenSum {
	
	// Brute-force solution with TC : O(n^3) SC : O(1)
	private static int findAllSubarraysWithGivenSum(int[] arr, int k) {
		int count = 0;
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				int sum = 0;
				for(int K=i; K<=j; K++) {
					sum += arr[K];
				}
				if(sum == k) {
					count++;
				}
			}
		}
		return count;
	}
	
	// Better solution with TC : O(n^2) SC : O(1)
	private static int findAllSubarraysWithGivenSum(int[] arr, int n,int k) {
		int count = 0;
			
		for(int i=0; i<n; i++) {
			int sum = 0;
			for(int j=i; j<n; j++) {
				sum += arr[j];
				if(sum == k) {
				count++;
				}
			}
		}
		return count;
	}
	
	// Optimal Solution with TC : O(n) and SC : O(n)
 	private static int findAllSubarraysWithSumK(int arr[], int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0, preSum = 0;
		map.put(0, 1);
		
		for(int i = 0; i<arr.length; i++) {
			preSum += arr[i];
			int remove = preSum - k;
			count += map.getOrDefault(remove, 0);
			map.put(preSum, map.getOrDefault(preSum, 0)+ 1);
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 1, 2, 4};
		System.out.println(findAllSubarraysWithGivenSum(arr, 6));
		System.out.println(findAllSubarraysWithGivenSum(arr, arr.length, 6));
		System.out.println(findAllSubarraysWithSumK(arr, 6));
	}

}
