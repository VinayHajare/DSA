package array.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 	There is an integer array ‘A’ of size ‘N’.
	A sequence is successive when the adjacent elements of the sequence have a difference of 1.
	You must return the length of the longest successive sequence.
	Note:
	You can reorder the array to form a sequence. 
	For example,
	Input:
	A = [5, 8, 3, 2, 1, 4], N = 6
	Output:
	5
 */
 
public class LongestSuccessiveElements {
	
	// TC : O(n) SC : O(1) 
	private static boolean linearSearch(int[] arr, int target) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == target) {
				return true;
			}
		}
		return false;
	}
	
	// Brute force solution with TC : O(n^2) SC : O(1)
	private static int longestSuccessiveElements(int[] arr) {
		int maxLength = 1;
		
		for(int i = 0; i < arr.length; i++) {
			int x = arr[i];
			int count = 1;
			while(linearSearch(arr, x+1)) {
				x = x + 1;
				count = count + 1;
			}
			maxLength = Math.max(maxLength, count);
		}
		
		return maxLength;
	}
	
	// Better solution with TC : O(n + nlogn) SC : O(1)
	private static int longestSuccessiveElements(int arr[], int n) {
		int maxLength = 1; 
		int count = 0;
		int lastSmallest = Integer.MIN_VALUE;
		
		if(n == 0) return 0;
		
		Arrays.sort(arr);
		
		for(int i = 0; i < n; i++) {
			if(arr[i]-1 == lastSmallest) {
				count++;
				lastSmallest = arr[i];
			}else if(lastSmallest != arr[i]) {
				count = 1;
				lastSmallest = arr[i];
			}
			maxLength = Math.max(maxLength, count);
		}
		
		return maxLength;	
	}
	
	//optimal solution with TC : O() SC : O()
	private static int longestSuccessiveElementsOptimal(int arr[], int n) {
		int  maxLength = 1;
		Set<Integer> set = new HashSet<Integer>();
		
		for(int ele : arr) {
			set.add(ele);
		}
		
		for(int ele : set) {
			if(!set.contains(ele-1)) {
				int count = 1;
				int x = ele;
				while(set.contains(x+1)) {
					x = x + 1;
					count++;
				}
				maxLength = Math.max(maxLength, count);
			}
		}
		
		return maxLength;
	}
	
	public static void main(String[] args) {
		int arr[] = {5, 8, 3, 2, 1, 4};
		System.out.println(longestSuccessiveElements(arr));
		System.out.println(longestSuccessiveElementsOptimal(arr, arr.length));
		System.out.println(longestSuccessiveElements(arr, arr.length));
	}

}
