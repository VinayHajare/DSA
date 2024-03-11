package array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 	You are given a 2D matrix ‘MATRIX’ of ‘N’*’M’ dimension. 
 	You have to return the spiral traversal of the matrix.
	
	Example:
	Input:
	MATRIX = [ 
		[1, 3, 5, 7], 
		[10, 11, 16, 20], 
		[23, 30, 34, 60] 
	]
	Output:
	1 3 5 7 20 60 34 30 23 10 11 16
*/

public class SpiralMatrix {

	// optimal solution with TC :O(n * m) SC : O(n * m)
	private static int[] spiralMatrix(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		List<Integer> ans = new ArrayList<Integer>(); // OR int[] = new int[n*m]; int index = 0 ; 
		
		int top = 0, bottom = n-1;
		int left = 0, right = m-1;
		
		while(top <= bottom && left <= right) {
			for(int i = left; i<=right; i++) {
				ans.add(matrix[top][i]); // ans[index++] = matrix[top][i];
			}
			top++;
			
			for(int i = top; i<=bottom; i++) {
				ans.add(matrix[i][right]); // ans[index++] = matrix[i][right];
			}
			right--;
			
			if(top <= bottom) {
				for(int i = right; i>=left; i--) {
					ans.add(matrix[bottom][i]); // ans[index++] = matrix[bottom][i];
				}
				bottom--;
			}
			
			if(left <= right) {
				for(int i = bottom; i>=top; i--) {
					ans.add(matrix[i][left]); // ans[index++] = matrix[i][left];
				}
				left++;
			}
		}
		
		return ans.stream().mapToInt((Integer val)-> val.intValue()).toArray();
	}

	public static void main(String[] args) {
		int[][] MATRIX = { 
		  		{1, 3, 5, 7}, 
		  		{10, 11, 16, 20}, 
		  		{23, 30, 34, 60} 
		};
		
		System.out.println(Arrays.toString(spiralMatrix(MATRIX)));
	}

}
