package array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/***
  Given two sorted arrays 'a' and 'b', of size 'n' and 'm', respectively. 
  Return the union of the arrays.
  The union of the two sorted arrays can be defined as an array consisting of the
  common and the distinct elements of the two arrays. The final array should be sorted in
  ascending order. 
  The array may contains duplicate elements, but the union array must contain unique element.
  Input: ‘n’ = 5 ‘m’ = 3
  ‘a’ = [1, 2, 3, 4, 6]
  ‘b’ = [2, 3, 5]
   Output: [1, 2, 3, 4, 5, 6]
 */

public class UnionOfSortedArrays {
	
	// Brute force solution using set with TC : O(alogn) + O(blogn) + O(a+b) SC: O(a+b) + O(a+b)
	private static int[] unionOfArrays(int[] a, int[] b) {
		Set<Integer> set = new TreeSet<>();
		
		for(int i : a) {
			set.add(i);
		}
		
		for(int i : b) {
			set.add(i);
		}
		
		int[] temp = new int[set.size()];
		int j = 0;
		for(int i : set) {
			temp[j] = i;
			j++;
		}
		
		return temp;
	}
	
	// Optimal Solution with TC:O(n+m) and SC: O(n+m)
	private static int[] mergeSortedArrays(int[] a, int[] b) {
		int i=0, j=0;
		List<Integer> list = new ArrayList<>();
		
		while(i<a.length && j<b.length) {
			if(a[i] <= b[j]) {
				if(!list.contains(a[i])) {
					list.add(a[i]);
				}
				i++;
			}else {
				if(!list.contains(b[j])) {
					list.add(b[j]);
				}
				j++;
			}
		}
		
		while(i < a.length) {
			if(!list.contains(a[i])) {
				list.add(a[i]);
			}
			i++;
		}
		
		while(j < b.length) {
			if(!list.contains(b[j])) {
				list.add(b[j]);
			}
			j++;
		}
		
		return list.stream().mapToInt((Integer val)-> val.intValue()).toArray();
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 3};
		int[] b = {2, 2, 4};
		System.out.println(Arrays.toString(unionOfArrays(a, b)));
		System.out.println(Arrays.toString(mergeSortedArrays(a, b)));
	}

}
