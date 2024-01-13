package array;

/**
 You are given array 'arr' containing 'n' integers. You are also given an integer 
 'num' and your task is to find whether 'num' is present in the array or not.  
*/
public class LinearSearch {

	// Time - complexity : O(n)
	private static int linearSearch(int[] arr, int num) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {6,7,8,4,1};
		System.out.println(linearSearch(arr, 4));
	}

}
