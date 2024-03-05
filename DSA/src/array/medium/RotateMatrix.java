package array.medium;

import java.util.Arrays;

/**
 	You are given a square matrix ‘Mat’ of size ‘N’. 
 	You need to rotate ‘Mat’ by 90 degrees in the clockwise direction.
	Note:
	You must rotate the matrix in place, i.e., you must modify the given matrix itself. 
	You must not allocate another square matrix for rotation.
	For example
	When,
	‘N’ = 2 and ‘Mat’ = {{1, 2}, {3, 4}}, we must modify ‘Mat’ to {{3, 1}, {4, 2}}.
 */

public class RotateMatrix {
	
	// Brute force approach with TC : O(n^2) SC : O(n^2)
	private static int[][] roatateMatrix(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		
		int[][] ans = new int[n][m];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				ans[j][n-1-i] = mat[i][j];
			}
		}
		
		return ans;
	}
	
	private static void reverse(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
	}
	
	// Optimal solution with TC : O(n/2 * n/2) SC : O(n * n/2)
	private static void rotateMatrix(int[][] mat, int n) {
		
		// First do the transpose of matrix
		for(int i = 0; i<n-1; i++) {
			for(int j = i+1; j<n; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		
		// reverse every row to get the final rotated matrix
		for(int i = 0; i<n; i++) {
			reverse(mat[i]);
		}
	}
	
	public static void main(String[] args) {
		int[][] Mat = {
						{1, 2}, 
						{3, 4}
					  };
		
		rotateMatrix(Mat, Mat.length);
		
		for(int i = 0; i<Mat.length; i++) {
			for(int j = 0; j<Mat.length; j++) {
				System.out.print(Mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
