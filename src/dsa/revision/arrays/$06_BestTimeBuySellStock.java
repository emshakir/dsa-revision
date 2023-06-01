package dsa.revision.arrays;

public class $06_BestTimeBuySellStock {

    public static void main(String[] args) {

        int[] prices = {7, 2, 1, 5, 4, 3, 6};
        optimised(prices);
    }

    private static int optimised(int[] prices) {
        int profit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i] - minPrice;
            profit = Math.max(currentPrice, profit);
            minPrice = Math.min(prices[i], minPrice);
        }

        return profit;
    }

    private static int getProfit(int[] prices) {
        int profit = 0;
        int minBuyPrice = Integer.MAX_VALUE;

        for (int price : prices) {

            // Am I having a price better than my purchased price, 
            // YES - generate profit by subtracting current price by purchased price
            // NO - Current Price <arr[i]> would be our minimum price as it is less than previous price
            if (price > minBuyPrice) {
                int currentPrice = price - minBuyPrice;
                profit = Math.max(profit, currentPrice);
            } else {
                minBuyPrice = price;
            }
        }

        return profit;
    }

    private static int bruteForce(int[] arr) {
        int profit = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; i++) {

                // Am I having a price better than my purchased price, 
                // YES - generate profit by subtracting current price by purchased price
                // NO - Current Price <arr[i]> would be our minimum price as it is less than previous price
                // arr[j] - next day price
                // arr[i] - purchased price
                if (arr[j] > arr[i]) {
                    int currentPrice = arr[j] - arr[i];
                    if (profit < currentPrice) {
                        profit = currentPrice;
                    }
                }
            }
        }

        return profit;
    }
}

/*
            [ 7, 2, 1, 5, 4, 3, 6 ]
              1  2  3  4  5  6  7
    
              Buy on 3 - 1
              Sell on 7 - 6
              Profit =>   6 - 1 = 5
    
 */
