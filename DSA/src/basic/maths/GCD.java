package basic.maths;
/** You are given two integers 'n' and 'm'.
 *  Calculate 'gcd(n,m)', without using library functions.
 *  The greatest common divisor of two numbers 'n' & 'm' is the 
 *  largest positive number that divides both 'n' and 'm' without leaving any remainder.
 */
public class GCD {
	
	// Brute-force approach Time-complexity : O(min(n,m))
	private static int calcGCD(int n, int m) {
		int gcd = 0;
		for(int i=1; i<Math.min(n, m); i++) {
			if( n%i == 0 && m%i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
	// Using euclidean algorithm Time-complexity : O(log(min(n,m)))
	private static int getGCD(int n, int m) {
		while(n > 0 && m > 0) {
			if(n > m) {
				n = n % m;
			}else {
				m = m % n;
			}
		}

		return n == 0 ? m : n;
	}
	
	public static void main(String[] args) {
		System.out.println(GCD.calcGCD(9, 6)); 
		System.out.println(GCD.getGCD(9, 6));
	}

}
