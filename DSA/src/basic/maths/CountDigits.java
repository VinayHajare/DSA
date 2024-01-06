package basic.maths;

/** You are given a integer 'n'. 
 *  Find the number of digits that evenly divide 'n'. 
 */
public class CountDigits {

	private static int countDigits(int n) {
		int count = 0, num = n;
		while(num > 0) {
			count++;
			num /= 10;
		}
		return count;
	}
	
	private static int countDigitsEvenlyDividingN(int n) {
		int count = 0, num = n;
		while(num > 0) {
			int digit = num%10;
			if(digit != 0 && n%digit == 0) {
				count++;
			}
			num /= 10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(CountDigits.countDigits(505045));
		System.out.println(CountDigits.countDigitsEvenlyDividingN(505045));
	}

}
