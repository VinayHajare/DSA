package array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
	You are given two arrays 'A' and 'B' of size 'N' and 'M' respectively. 
	Both these arrays are sorted in non-decreasing order. 
	You have to find the intersection of these two arrays.
    Intersection of two arrays is an array that consists of all the common elements occurring in both arrays.	
    Input: ‘n’ = 5 ‘m’ = 3
	‘a’ = [1, 2, 3, 4, 6]
	‘b’ = [2, 3, 5]
 	Output: [2, 3]
*/

public class IntersectionOfSortedArray {
	
	// Brute-Force approach with TC : O(n*m) SC: O(m)
	private static int[] intersectionOfArrays(int[] a, int[] b) {
		int n = a.length;
		int m = b.length;
		boolean visited[] = new boolean[m];
		List<Integer> ans = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(a[i] == b[j] && visited[j] == false) {
					ans.add(a[i]);
					break;
				}
				if(b[j] > a[i]) {
					break;
				}
			}
		}
		return ans.stream().mapToInt((Integer i) -> i.intValue()).toArray();
	}
	
	// Optimal Solution with TC : O(n + m) and SC : O(1)
	private static int[] findArrayIntersection(int[] a, int[] b) {
		int n = a.length;
		int m = b.length;
		int i = 0, j = 0;
		List<Integer> ans = new ArrayList<>();
		
		while(i<n && j<m) {
			if(a[i] < b[j]) {
				i++;
			}else if(b[j] < a[i]) {
				j++;
			}else {
				ans.add(a[i]);
				i++;
				j++;
			}
		}
		return ans.stream().mapToInt((Integer val)-> val.intValue()).toArray();
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 3};
		int[] b = {1, 2, 3};
		System.out.println(Arrays.toString(intersectionOfArrays(a, b)));
		System.out.println(Arrays.toString(findArrayIntersection(a, b)));
	}

}
