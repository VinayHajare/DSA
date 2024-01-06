package basic.recursion;

import java.util.Arrays;

/**
 * You are given 'n'.
 * Your task is to return an array containing integer from 'n' to 1 (in decreasing order)
 * without using loops
 */
public class WithoutLoopNto1 {
	
	private static void printHelper(int x,int n, int[] arr) {
		if(x > n) {
			return;
		}
		printHelper(x+1, n, arr);
		arr[n-x] = x;
	}
	
	private static int[] printNos(int n) {
		int ans[] = new int[n];
		printHelper(1, n, ans);
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.print(Arrays.toString(printNos(10)));
	}

}
