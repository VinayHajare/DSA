package basic.recursion;

import java.util.Arrays;

/**
 * You are given an integer 'n',
 * Your task is to return an array conataining integers from 1 to n (in increasing order)
 * without using loops.
 */
public class WithoutLoop1toN {

	private static void printHelper(int n, int[] arr) {
		if(n == 0) {
			return;
		}
		printHelper(n-1, arr);
		arr[n-1] = n;
	}
	
	private static int[] printNos(int n) {
		int ans[] = new int[n];
		printHelper(n, ans);
		return ans;
	}
	
	public static void main(String[] args) {
		int temp[] = printNos(15);
		System.out.println(Arrays.toString(temp));
	}

}
