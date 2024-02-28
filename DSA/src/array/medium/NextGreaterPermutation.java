package array.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 You are given an array ‘a’ of ‘n’ integers.
 You have to return the lexicographically next to greater permutation.
 Note:
 If such a sequence is impossible, it must be rearranged in the lowest possible order.
 Example:
 Input: 'a' = [1, 3, 2]
 Output: 2 1 3
 
*/

public class NextGreaterPermutation {

	private static List<Integer> nextGreaterPermutation(List<Integer> arr){
		
		int index = -1;
		int n = arr.size();
		for(int i = n-2; i >= 0; i--) {
			if(arr.get(i) < arr.get(i)) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			Collections.reverse(arr);
			return arr;
		}
		
		for(int i = n-1; i>=0; i--) {
			if(arr.get(i) > arr.get(index)) {
				Collections.swap(arr, index, i);
				break;
			}
		}
		
		Collections.reverse(arr.subList(index+1, n));
		
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println(nextGreaterPermutation(Arrays.asList(new Integer[]{3, 2, 1})));
	}

}
