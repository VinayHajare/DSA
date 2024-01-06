package basic.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given 'n'.
 * Your task is to return a sorted array (in increasing order) 
 * containing all the factorial numbers which are less than or 
 * equal to 'n'.
 * The factorial number is a factorial of a positive integer like 24 is a 
 * factorial number, as it is a factorial of 4.
 */
public class Factorial {

	private static long fact(long n) {
		if(n == 1) {
			return 1;
		}
		
		return n * fact(n-1);
	}
	
	private static List<Long> factorialNumbers(long n){
		List<Long> list = new ArrayList<>();
		for(long i=1; i<=n; i++) {
			long factorial = fact(i);
			if(factorial > n) {
				break;
			}
			list.add(factorial);
		}
		return list;
	}
	public static void main(String[] args) {
		System.out.print(factorialNumbers(6));
	}

}
