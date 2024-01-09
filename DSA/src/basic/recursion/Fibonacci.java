package basic.recursion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer 'n', return first n Fibonacci numbers using a generator function.
 */

public class Fibonacci {
	
	private static Map<Integer, Integer> memo = new HashMap<>();
	// O(n)
	private static int findNthFibonacci(int n) {
		if(n < 0) {
			throw new IllegalArgumentException("N should be positive integer");
		}
		if(n == 1) {
			return 0;
		}
		if(n == 2) {
			return 1;
		}
		if(n == 3) {
			return 1;
		}
		if(memo.containsKey(n)) {
			return memo.get(n);
		}
		
		int fib = findNthFibonacci(n-1) + findNthFibonacci(n-2);
		memo.put(n, fib);
		return fib;
	}
	
	// Time complexity : O(n) space complexity : O(n)
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
	
	// time-complexity : O(2^n) space-complexity : O(1) with recursive stack space
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
	
	// time-complexity : O(2^n)
	private static int fibo(int n) {
		if(n == 1) return 0;
		if(n == 2) return 1;
		if(n == 3) return 1;
		
		return fibo(n-1) + fibo(n-2);
 	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(generateFibonacciNumbers(5)));
		System.out.println(fibonacci(5));
		System.out.println(fibo(5));
		System.out.println(findNthFibonacci(5));
	}

}
