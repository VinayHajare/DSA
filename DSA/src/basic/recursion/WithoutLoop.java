package basic.recursion;
/**
 *  You are given an integer 'n'.
 *  Your task is to returned an array containing integers from 1 to 'n'(in increasing order)
 *  without using loops.
 */
public class WithoutLoop {
	
	private static void recursiveHelper(int x, int[] arr) {
		if(x == 0) {
			return;
		}
		recursiveHelper(x-1, arr);
		arr[x-1] = x;
	}
	
	private static int[] printNos(int x) {
		int arr[] = new int[x];
		recursiveHelper(x, arr);
		return arr;
	}
	
	public static void main(String[] args) {
		int ans[] = WithoutLoop.printNos(12);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
