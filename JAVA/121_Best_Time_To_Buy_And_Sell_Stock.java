//121. Best Time to Buy and Sell Stock
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//Method 1: Brute Force
//Time Complexity: O(n^2), Space Complexity: O(1)
class Solution1 {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 0; i < prices.length; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > max)
                    max = prices[j] - prices[i];
            }
        }
        return max; 
    }
}
//Method 2: One Pass
//Time Complexity: O(n), Space Complexity: O(1)
class Solution2 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int price : prices) {
            if(price < min)
                min = price;
            else
                max = Math.max(max,price - min);
        }
        return max;
    }
}
