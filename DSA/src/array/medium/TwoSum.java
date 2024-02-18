package array.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 Sam want to read exactly ‘TARGET’ number of pages.
 He has an array ‘BOOK’ containing the number of pages for ‘N’ books.
 Return YES/NO, if it is possible for him to read any 2 books and he can meet his ‘TARGET’ number of pages.
 
 Example:
 Input: ‘N’ = 5, ‘TARGET’ = 5
 ‘BOOK’ = [4, 1, 2, 3, 1] 
 Output: YES
 */
public class TwoSum {
	
	// Brute force solution with TC : O(n^2) SC: O(1)
	private static String read(int book[], int n, int target) {
		for (int i = 0; i < n; i++) {
			for(int j = 0; i < n; j++) {
				if(i == j) {
					continue;
				}
				
				if(book[i] + book[j] == target) {
					return "YES";// new int[]{i, j};
 				}
			}
		}
		return "NO"; // new int[]{-1, -1};
	}
	
	// Better Solution with TC: O(n) SC: O(n)
	private static String read(int[] book, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i < book.length; i++) {
			int curr = book[i];
			int more = target - curr;
			
			if(map.containsKey(more)) {
				return "YES";
			}
			
			map.put(curr, i);
		}
		
		return "NO";
	}
	
	// Optimal solution with TC : O(2nlogn) SC O(1)
	private static String readOptimized(int book[], int n,  int target) {
		int left = 0, right = n-1;
		Arrays.sort(book);
		while(left < right) {
			int sum = book[left] + book[right];
			if(sum > target) {
				right--;
			}else if(sum < target) {
				left++;
			}else {
				return "YES";
			}
		}
		return "NO";
	}
	
	public static void main(String[] args) {
		int[] book = {4, 1, 2, 3, 1};
		System.out.println(read(book, book.length, 5));
		System.out.println(read(book, 5));
		System.out.println(readOptimized(book, book.length, 5));
	}

}
