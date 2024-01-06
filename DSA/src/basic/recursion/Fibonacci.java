package basic.recursion;

import java.util.Arrays;

/**
 * Given an integer 'n', return first n Fibonacci numbers using a generator function.
 */

public class Fibonacci {

	private static int[] generateFibonacciNumbers(int n) {
		int[] ans = new int[n];
		ans[0] = 0;
		
		if(n == 1) {
			return ans;
		}
		
		ans[1] = 1;
		
		for(int i = 2; i<n; i++) {
			ans[i] = ans[i-1] + ans[i-2];
		}
		
		return ans;
	}
	
	private static int fibonacci(int n) {
		if(n == 1) {
			return 0;
		}
		
		if(n == 2) {
			return 1;
		}
		
		if(n == 3) {
			return 1;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(generateFibonacciNumbers(5)));
		System.out.println(fibonacci(9));
	}

}
