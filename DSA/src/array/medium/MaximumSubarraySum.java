package array.medium;

/**
 You are given an array 'arr' of length 'n', consisting of integers.
 A subarray is a contiguous segment of an array. In other words, 
 a subarray can be formed by removing 0 or more integers from the beginning 
 and 0 or more integers from the end of an array.
 Find the sum of the subarray (including empty subarray) having maximum sum among all subarrays.
 The sum of an empty subarray is 0.

 Example :
 Input: 'arr' = [1, 2, 7, -4, 3, 2, -10, 9, 1]

 Output: 11

 Explanation: The subarray yielding the maximum sum is [1, 2, 7, -4, 3, 2].
 */

public class MaximumSubarraySum {

	// Brute force solution with TC : O(n^3) SC : O(1)
	private static int maxSubarraySum(int[] arr) {
		int maxSum = 0, n = arr.length;
		
		for(int i = 0; i<n; i++) {
			for(int j = i; j<n; j++) {
				int sum = 0;
				for(int k = i; k<=j; k++) {
					sum += arr[k]; 
				}
				maxSum = Math.max(maxSum, sum);
			}
		}
		
		if(maxSum < 0) return 0;
		return maxSum;
	}
	
	// optimized brute force solution with TC : O(n^2) SC : O(1)
	private static int maxSubarraySum(int arr[], int n) {
		int maxSum = 0;
		
		for(int i = 0; i<n; i++) {
			int sum = 0;
			for(int j=0; j<n; j++) {
				sum += arr[j];
				maxSum = Math.max(maxSum, sum);
			}
		}
		
		if(maxSum < 0) return 0;
		return maxSum;
	}
	
	// optimal solution with TC : O(1) SC : O(1)
	private static int maximumSubarraySum(int arr[]) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int num : arr) {
			sum += num;
			maxSum = Math.max(maxSum, sum);
			
			if(sum < 0) {
				sum = 0;
			}
		}
		
		if(maxSum < 0) return 0;
		return maxSum;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 7, -4, 3, 2, -10, 9, 1};
		
		System.out.println(maxSubarraySum(arr));
		System.out.println(maxSubarraySum(arr, arr.length));
		System.out.println(maximumSubarraySum(arr));
	}

}
