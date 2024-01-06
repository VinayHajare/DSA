package basic.maths;
/** Check whether a given number 'n' is a palindrome number.
 *  Palindrome number are the numbers that don't change when reversed.
 */
public class PalindromeNumber {
	
	private static boolean isPalindrome(int n) {
		int original = n, reverse = 0;
		while(n > 0) {
			int lastDigit = n % 10;
			reverse = (reverse * 10) + lastDigit;
			n /= 10;
		}
		return original == reverse;
	}
	
	public static void main(String[] args) {
		System.out.println(PalindromeNumber.isPalindrome(121));
	}

}
