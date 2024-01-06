package basic.simple;

import java.util.HashMap;
import java.util.Scanner;

public class NthFibonacciNumber {
	
	private static HashMap<Integer, Integer> memo = new HashMap<>();
	
    private static int fibo(int n){
        if(n <= 0){
            throw new IllegalArgumentException("Number must be non-zero positive");
            }
        if(n<=2){
            return 1;
            }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int fib = fibo(n-1) + fibo(n-2);
        memo.put(n,fib);
        return fib;
        }
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fibo(num));
        sc.close();
	}
}
