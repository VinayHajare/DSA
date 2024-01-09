package sorting.recursive;

import java.util.Arrays;

/**
 * You are given an integer array 'arr' of size 'n'.
 * You must sort this array using recursive bubble sort.
 */

public class RecursiveBubbleSort {
	
	// Time-complexity : O(n)
	private static void bubbleSort(int[] arr, int n){
		if(n==1) return;
        
        for(int i=0; i<=n-2; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        
        bubbleSort(arr,n-1);
	}
	
	public static void main(String args[]) {
		int arr[] = {57,78,1,45};
		bubbleSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
}
