package array.easy;

/**
 	You are given an array ‘ARR’ of length ‘N’ consisting of only ‘0’s and ‘1’s. 
 	Your task is to determine the maximum length of the consecutive number of 1’s.
	For Example:
	ARR = [0, 1, 1, 0, 0, 1, 1, 1], 
	here you can see the maximum length of consecutive 1’s is 3. 
	Hence the answer is 3.
*/
public class MaximumConsecutiveOnes {

	private static int consecutiveOnes(int[] arr) {
		int count = 0;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == 1) {
				count++;
				max = Math.max(max, count);
			}else {
				count = 0;
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 0, 0, 1, 1, 1};
		System.out.println(consecutiveOnes(arr));
 	}

}
