package basic.maths;

/** You are given an integer n. Return true if n is armstrong number and false otherwise.
 *   
 */
public class ArmstrongNumber {
	
	private static int countDigits(int n) {
		int count = 0;
		while(n > 0) {
			count++;
			n /= 10;
		}
		return count;
	}
	
	private static boolean isArmstrongNumber(int n) {
		int digits = ArmstrongNumber.countDigits(n);
		int original = n, armstrong = 0;
		while(n > 0) {
			int lastDigit = n % 10;
			armstrong += Math.pow(lastDigit, digits);
			n /= 10;
		}
		return original == armstrong;
	}
	
	private static boolean isArmstrong(int n) {
		int original = n, armstrong = 0;
		while( n > 0) {
			int lastDigit = n % 10;
			armstrong =  armstrong + (int) Math.pow(lastDigit, 3);
			n /= 10;
		}
		return original == armstrong;
	}
	
	public static void main(String[] args) {
		System.out.println(ArmstrongNumber.isArmstrongNumber(1634));
		System.out.println(ArmstrongNumber.isArmstrong(1634));
	}
}
