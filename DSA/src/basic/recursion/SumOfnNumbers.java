package basic.recursion;

/**
 * You are given an integer 'n'.
 * Your task is to determine the sum of the first 'n' natural numbers and
 * returning it.
 */
public class SumOfnNumbers {
	
	private static int sumOfFirstN(int n) {
		if(n == 0) {
			return 0;
		}
		
		return n + sumOfFirstN(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(sumOfFirstN(5));
	}

}
