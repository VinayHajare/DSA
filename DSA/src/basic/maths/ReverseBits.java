package basic.maths;

/** There is a song concert going to happen in the city. The price of the ticket is equal to a number
 *  obtained after reversing the bits of given 32-bit unsigned integer 'n'.
 */

public class ReverseBits {
	
	private static int reverseNumber(int n) {
		int reverse = 0, num = n;
		while(num > 0) {
			int lastDigit = num%10;
			reverse = (reverse * 10) + lastDigit;
			num /= 10;
		}
		return reverse;
	}
	
	private static long reverseBits(long n) {
		int bitSize = 32;
		long reverse = 0;
		
		for(int i = 0; i<bitSize; i++) {
			long bit = (n >> i) & 1;
			reverse = reverse | (bit << bitSize-1-i);
		}
		
		return reverse;
	}
	
	public static void main(String[] args) {
		System.out.println(ReverseBits.reverseNumber(12345));
		System.out.println(ReverseBits.reverseBits(50));
	}

}
