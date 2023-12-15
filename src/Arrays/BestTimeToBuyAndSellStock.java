package Arrays;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        // intiate smallest value and max profit
        int min_val = Integer.MAX_VALUE;
        int max_profit = 0;

        // iterate through prices
        for (int i = 0; i < prices.length; i++) {
            // if current price is less than the min value
            if (prices[i] < min_val)
                // set min value to that current price
                min_val = prices[i];
            // if current price minus the min value is greater than the max profit
            else if (prices[i] - min_val > max_profit)
                // max profit will be the current price minus buy value
                max_profit = prices[i] - min_val;
        }
        return max_profit;
    }
}
