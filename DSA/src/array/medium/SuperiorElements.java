package array.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
   There is an integer array ‘a’ of size ‘n’.
	An element is called a Superior Element if it is greater than all the elements present to its right.
	You must return an array all Superior Elements in the array ‘a’.
	Note:
	The last element of the array is always a Superior Element. 
	Example
	Input: a = [1, 2, 3, 2], n = 4
	Output: 2 3
*/

public class SuperiorElements {
	
	// Brute force solution with TC : O(n^2) + O(nlogn) SC : O(n)
	private static List<Integer> superiorElements(int []a, int n){
		List<Integer> ans = new ArrayList<Integer>();
		
		for(int i = 0; i<n; i++) {
			boolean superior = true;
			
			for(int j = i+1; j<n; j++) {
				if(a[j] > a[i]) {
					superior = false;
					break;
				}
			}
			
			if(superior) {
				ans.add(a[i]);
			}
		}
		Collections.sort(ans);
		return ans;
	}
	
	// optimal solution with TC : O(n) + O(nlogn) SC : O(n)
	private static List<Integer> superiorElements(int a[]){
		List<Integer> ans = new ArrayList<Integer>();
		int max = Integer.MIN_VALUE;
		
		for(int i = a.length-1; i >= 0; i--) {
			if(a[i] > max) {
				ans.add(a[i]);
			}
			max = Math.max(max, a[i]);
		}
		
		Collections.sort(ans);
		return ans;
	}
	
 	public static void main(String[] args) {
 		int a[] = {1, 2, 3, 2};
 		System.out.println(superiorElements(a, a.length));
 		System.out.println(superiorElements(a));
	}

}
