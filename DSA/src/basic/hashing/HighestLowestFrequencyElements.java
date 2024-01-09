package basic.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array 'v' and 'n' numbers. Your task is to find and return the highest and lowest frequency elements.
 * If there are multiple elements that have the highest frequency or lowest frequency, pick the smallest element.
 */
public class HighestLowestFrequencyElements {

	private static int[] getFrequencies(int[] v) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int highestFrequency = 0, lowestFrequnecy = Integer.MAX_VALUE;
		
		// hashing elements frequency
		for(int num : v) {
			int frequency = map.getOrDefault(num, 0)+1;
			map.put(num, frequency);
			highestFrequency = Math.max(highestFrequency, frequency);
			lowestFrequnecy = Math.min(lowestFrequnecy, frequency);
		}
		
		// finding the elements
		int highestFrequencyElement = Integer.MAX_VALUE;
		int lowestFrequencyElement = Integer.MAX_VALUE;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int num = entry.getKey();
			int frequency = entry.getValue();
			
			if(frequency == highestFrequency && num < highestFrequencyElement) {
				highestFrequencyElement = num;
			}
			
			if(frequency == lowestFrequnecy && num < lowestFrequencyElement) {
				lowestFrequencyElement = num;
			}
		}
		return new int[] {highestFrequencyElement, lowestFrequencyElement};
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,1,1,4};
		System.out.println(Arrays.toString(getFrequencies(arr)));
	}

}
