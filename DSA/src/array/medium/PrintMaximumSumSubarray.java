package array.medium;

public class PrintMaximumSumSubarray {

	private static int[] maxSumSubarray(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		int ansStart = -1, ansEnd = -1, start = -1;
		
		for(int i = 0; i<arr.length; i++) {
			if(sum == 0) {
				start = i;
			}
			
			sum += arr[i];
			
			if(sum > maxSum) {
				maxSum = sum;
				ansStart = start;
				ansEnd = i;
			}
			
			if(sum < 0) {
				sum = 0;
			}
		}
		
		if(maxSum < 0) {
			return new int[] {};
		}
		
		return new int[] {ansStart, ansEnd};
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 2, 7, -4, 3, 2, -10, 9, 1};
		int ans[] = maxSumSubarray(arr);
		System.out.print("[");
		for(int i = ans[0]; i<= ans[1]; i++) {
				System.out.print(arr[i]+", ");
		}
		System.out.println("]");
	}

}
