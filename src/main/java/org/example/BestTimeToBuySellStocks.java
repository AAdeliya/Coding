package org.example;

public class BestTimeToBuySellStocks {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > minPrice) {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);

            } else {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }
}
