package array.medium;

/*
  You are given an array of integers 'prices' of size 'n', 
  where ‘prices[i]’ is the price of a given stock on an ‘i’-th day.
  You want to maximize the profit by choosing a single day to buy one stock 
  and a different day to sell that stock.
  Please note that you can’t sell a stock before you buy one.
  Return the maximum profit you can achieve from this transaction.
  Example :
  Input: ‘prices’ =[7, 1, 5, 4, 3, 6]
  Output: 5
  Explanation: Purchase stock on day two, where the price is one, and sell it on day six, where the price is 6, profit = 6 - 1 = 5.

 */

public class BestTimeToBuyAndSellStock {
	
	private static int bestTimeToBuyAndSellStock(int []prices) {
		int mini = prices[0];
		int maxProfit = Integer.MIN_VALUE;
		
		for(int i = 1; i < prices.length; i++) {
			int cost = prices[i] - mini;
			maxProfit = Math.max(maxProfit, cost);
			mini = Math.min(mini, prices[i]);
		}
		
		return maxProfit;
	}
	
	public static void main(String[] args) {
		int prices[] = {7, 1, 5, 4, 3, 6};
		System.out.println(bestTimeToBuyAndSellStock(prices));
	}

}
