package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
  Given an array 'arr' of 'n' non-negative integers, your task is to move all the zeros to 
  the end of the array while keeping the non-zero elements at start of the array in their original order.
  Return the modified array.
 */

public class MoveZerosToEnd {

	// brute force - Time-complexity : O(n)+O(k)+O(n-k) ~ O(2n) Space-complexity : O(k) where k = number of unique elements
	// For worst case Space-complexity : O(n)
	private static int[] moveZeros(int arr[], int n) {
		List<Integer> temp = new ArrayList<Integer>();
		
		for(int i=0; i<n; i++) {
			if(arr[i] != 0) {
				temp.add(arr[i]);
			}
		}
		
		if(temp.size() == n) return arr;
		
		for(int i = 0; i<temp.size(); i++) {
			arr[i] = temp.get(i);
		}
		
		for(int i=temp.size(); i<n; i++) {
			arr[i] = 0;
		}
		
		return arr;
	}
	
	//optimal solution - time Complexity : O(n) space complexity : O(1)
	private static int[] moveZeros(int[] arr) {
		int j = -1;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == 0) {
				j = i;
				break;
			}
		}
		
		if(j == -1) return arr;
		
		for(int i = j+1; i < arr.length; i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,9,5,3};
		System.out.println(Arrays.toString(moveZeros(arr)));
	}

}
