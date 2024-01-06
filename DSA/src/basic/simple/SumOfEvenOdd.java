package basic.simple;

import java.util.Scanner;

public class SumOfEvenOdd {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int odd = 0, even = 0;
		
		while(num > 0) {
			int last = num%10;
			if(last%2 == 0) {
				even += last;
			}else {
				odd += last;
			}
			num /= 10;
		}

		System.out.println("Even-"+even+"Odd-"+odd);
		sc.close();
	}
}
