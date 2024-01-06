package basic.maths;

/** You are given an integer 'n'. Function 'sumOfDivisor(n)' is defined as the sum of all divisor of 'n'.
 *  Find the sumOfDivisors(i)' for all 'i' from 1 to 'n'.
 *  
 */
public class AllDivisors {
	// Time-complexity : O(sqrt(n))
	private static int sumOfAllDivisors(int n) {
		int sum = 0;
		for(int i = 1; i<=Math.sqrt(n); i++) {
			if(n%i == 0) {
				sum += i;
				if((n/i) != i) {
					sum = sum + (int)(n/i);
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(AllDivisors.sumOfAllDivisors(5));
		int sum = 0;
		for(int i = 1; i<= 5; i++) {
			sum += AllDivisors.sumOfAllDivisors(i);
		}
		
		System.out.println(sum);
	}

}
