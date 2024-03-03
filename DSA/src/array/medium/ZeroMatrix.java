package array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
   You are given a matrix 'MATRIX' of dimension 'N' x 'M'. 
   Your task is to make all the elements of row 'i' and column 'j' equal to 0
   if any element in the ith row or jth column of the matrix is 0.
   Note:
	1) The number of rows should be at least 1.
	2) The number of columns should be at least 1.
*/

public class ZeroMatrix {
	
	private static void markRow(List<List<Integer>> matrix , int n, int m, int i) {
		for(int j = 0; j<m; j++) {
			if(matrix.get(i).get(j) != 0) {
				matrix.get(i).set(j, -1);
			}
		}
	}
	
	private static void markColumn(List<List<Integer>> matrix, int n, int m, int j) {
		for(int i = 0; i<n; i++) {
			if(matrix.get(i).get(j) != 0) {
				matrix.get(i).set(j, -1);
			} 
		}
	}
	
	// Brute force solution with TC : O((n*m)*(n+m + (n*m)
	private static List<List<Integer>> zeroMatrix(List<List<Integer>> matrix, int n, int m){
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(matrix.get(i).get(j) == 0) {
					markRow(matrix, n, m, i);
					markColumn(matrix, n, m, j);
				}
			}
		}
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(matrix.get(i).get(j) == -1) {
					matrix.get(i).set(j, 0);
				}
			}
		}
		
		return matrix;
	}

	// Better solution with TC : O(2 * n * m) SC : O(n + m)
	private static List<List<Integer>> zeroMatrix(List<List<Integer>> matrix){
		
		int n = matrix.size();
		int m = matrix.get(0).size();
		
		boolean column[] = new boolean[m];
		boolean row[] = new boolean[n];
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(matrix.get(i).get(j) == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(row[i] || column[j]) {
					matrix.get(i).set(j, 0);
				}
			}
		}
		
		return matrix;
	}
	
	// optimal solution with TC : O((n * m) + (n*m)) SC : O(1)
	private static List<List<Integer>> zeroMatrix(List<List<Integer>> matrix, int n){
		int col0 = 1;
		int m = matrix.get(0).size();
		
		for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    matrix.get(i).set(0,0);
                   if(j!=0){
                       matrix.get(0).set(j,0);
                   }else{
                       col0=0;
                   }
             }
           }
        }
		
		for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix.get(i).get(0)==0||matrix.get(0).get(j)==0){
                    
                   matrix.get(i).set(j,0);
              }
            }
        }
		
        if(matrix.get(0).get(0)==0){
            for(int j=0;j<m;j++){
                matrix.get(0).set(j,0);
            }
        }
        if(col0==0){
            for(int i=0;i<n;i++){
                matrix.get(i).set(0,0);
            }
        }
		
		return matrix;
	}
	
	public static void main(String[] args) {
		List<List<Integer>> matrix = new ArrayList<>();
		matrix.add(Arrays.asList(2, 4, 3));
		matrix.add(Arrays.asList(1, 0, 0));
		
		//zeroMatrix(matrix, matrix.size(), matrix.get(0).size());
		//zeroMatrix(matrix);
		zeroMatrix(matrix, matrix.size());
		for(int i = 0; i<matrix.size(); i++) {
				System.out.println(matrix.get(i));
		}
	}

}
