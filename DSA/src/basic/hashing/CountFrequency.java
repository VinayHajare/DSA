package basic.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * You are given an array 'arr' of length 'n' containing integers within the range '1' to 'x'.
 * Your task is to count frequency of all elements from 1 to n;
 */
public class CountFrequency {

	// Time-complexity : O(n) Space-Complexity : O(x)
	private static int[] countFrequency(int n, int x, int nums[]) {
		int[] frequency = new int[x];
		
		for(int num : nums) {
			frequency[num-1]++;
		}
		
		return Arrays.copyOf(frequency, n);
	}
	
	// Time-complexity : O(2n) space-complexity : O(2n)
	public static int[] countFrequencies(int n, int x, int[] nums) {
		int[] frequency = new int[n];
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		for(int i=1; i<=n; i++) {
			frequency[i-1] = map.getOrDefault(i, 0);
		}
		return frequency;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,1,9,2,7};
		System.out.println(Arrays.toString(countFrequency(6, 9, arr)));
		System.out.println(Arrays.toString(countFrequencies(6, 9, arr)));
	}

}
