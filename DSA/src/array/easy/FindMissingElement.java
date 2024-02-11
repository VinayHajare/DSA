package array.easy;

/**
   Given an array ‘a’ of size ‘n’-1 with elements of range 1 to ‘n’. 
   The array does not contain any duplicates. Your task is to find the missing number.
   Input:
	'a' = [1, 2, 4, 5], 'n' = 5

   Output :
	3
 */
public class FindMissingElement {

	// brute force solution with TC : O(n^2) SC: O(1)
	private static int missingNumber(int[] a, int n) {
		for(int i = 1; i<=n; i++) {
			boolean flag = false;
			for(int j = 0; j<n-1; j++) {
				if(i == a[j]) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				return i;
			}
		}
		return -1;
	}
	
	//better solution with TC: O(2n) SC: O(n)
	private static int findMissingNumber(int[] a, int n) {
		boolean hash[] = new boolean[n+1];
		for(int i = 0; i<n-1; i++) {
			hash[a[i]] = true;
		}
		for(int j = 1; j<n; j++) {
			if(hash[j] == false) {
				return j;
			}
		}
		return -1;
	}
	
	// optimal solution with TC: O(n) SC: O(1)
	private static int findMissingNumberWithSum(int[] a, int n) {
		
		int sum = n * (n+1)/2;
		int sum2 = 0;
		for(int i = 0; i<n-1; i++) {
			sum2 += a[i]; 
		}
		
		return sum-sum2;
	}
	
	// optimal solution with TC: O(n) sc: O(1)
	private static int findMissingNumberWithXOR(int[] a, int n) {
		int xor=0, xor2=0; 
		for(int i=0; i<n-1; i++) {
			xor= xor ^ a[i];
			xor2= xor2 ^ (i+1);
		}
		xor2 = xor2 ^ n;
		
		return xor2^xor;
	}
	
 	public static void main(String[] args) {
 		int a[] = {1, 2, 4, 5};
 		System.out.println(missingNumber(a, 5));
 		System.out.println(findMissingNumber(a, 5));
 		System.out.println(findMissingNumberWithSum(a, 5));
 		System.out.println(findMissingNumberWithXOR(a, 5));
	}

}
