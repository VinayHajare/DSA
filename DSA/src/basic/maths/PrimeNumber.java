package basic.maths;

public class PrimeNumber {

	private static boolean isPrime(int n) {
		int count = 0;
		for(int i = 1; i<=Math.sqrt(n); i++) {
			if( n%i == 0) {
				count++;
				if((n/i) != i) {
					count++;
				}
			}
		}
		return count == 2;
	}
	
	public static void main(String[] args) {
		System.out.println(PrimeNumber.isPrime(5));
	}

}
