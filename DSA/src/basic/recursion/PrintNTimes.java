package basic.recursion;

import java.util.ArrayList;
import java.util.List;

/** 
 *  You are given an integer 'n'.
 *  Print "Coding Ninjas" n times without using loop
 */

public class PrintNTimes {

	private static void print(int n, List<String> buffer) {
		if(n == 0) {
			return;
		}
		buffer.add("Coding Ninjas");
		print(n-1, buffer);
	}
	
	private static void printNTimes(int n) {
		List<String> ans = new ArrayList<>();
		print(n, ans);
		for(String msg : ans) {
			System.out.println(msg);
		}
	}
	
	public static void main(String[] args) {
		printNTimes(5);
	}

}
