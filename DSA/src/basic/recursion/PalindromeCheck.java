package basic.recursion;
/**
 * Determine if a given string 'S' is a palindrome or not using recursion. Return a Boolean
 * value of true if it is a palindrome and false if it is not.
 */
public class PalindromeCheck {
 
	private static boolean isPalindrome(String str, int i) {
		if(i >= str.length()/2) {
			return true;
		}
		
		if(str.charAt(i) != str.charAt(str.length()-i-1)) {
			return false;
		}
		
		return isPalindrome(str, i+1);
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("racecar", 0));
	}

}
