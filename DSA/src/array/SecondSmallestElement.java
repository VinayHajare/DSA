package array;
/**
  You have been given an array 'arr' of 'n' unique non-negative integers.
  Find the second smallest element from the array.
*/

public class SecondSmallestElement {
	
	private static int secondSmallestElement(int[] arr, int n) {
		int secondSmallest = Integer.MAX_VALUE, smallest = arr[0];
		for(int i = 1; i<n; i++) {
			if(arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}else if(arr[i] > smallest && arr[i] < secondSmallest){
				secondSmallest = arr[i];
			}	
		}
		return secondSmallest;
	}
	
	public static void main(String[] args) {
		int arr[] =  {13 , 45, 67, 6, 12};
		System.out.println(secondSmallestElement(arr, arr.length));
	}

}
