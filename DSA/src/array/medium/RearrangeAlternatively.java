package array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 
  Given an array arr of size N containing positive and negative integers. 
  Arrange the array alternatively such that every non-negative integer is followed by a negative integer and vice-versa.
  Note:
	The number of positive integers and negative integers may not be equal. In such cases, add the extra integers at the end.
	For Example:
	For array {4, -9, -2, 6, -8}, the output will be {-9, 4, -2, 6, -8}
	For array {1, 2, 3, -5}, the output will be {-5, 1, 2, 3}  
 */

public class RearrangeAlternatively {
	
	// optimal solution with TC : O(2n) SC : O(n)
	private static int[] rearrange(int[] arr) {
		List<Integer> pos = new ArrayList<Integer>();
		List<Integer> neg = new ArrayList<Integer>();
		
		for(int ele : arr) {
			if(ele > 0) {
				pos.add(ele);
			}else {
				neg.add(ele);
			}
		}
		
		if(pos.size() > neg.size()) {
			
			for(int i = 0; i<neg.size(); i++) {
				arr[2*i] = pos.get(i);
				arr[2*i+1] = neg.get(i);
			}
			
			// add remaining positive array
			int index = neg.size()*2;
			
			for(int i = neg.size(); i<pos.size(); i++) {
				arr[index++] = pos.get(i);
			}
			
 		}else {
			
 			for(int i = 0; i<pos.size(); i++) {
				arr[2*i] = pos.get(i);
				arr[2*i+1] = neg.get(i);
			}
			
			// add remaining positive array
			int index = pos.size()*2;
			
			for(int i = pos.size(); i<neg.size(); i++) {
				arr[index++] = neg.get(i);
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = {4, -9, -2, 6, -8};
		System.out.println(Arrays.toString(rearrange(arr)));
	}

}
