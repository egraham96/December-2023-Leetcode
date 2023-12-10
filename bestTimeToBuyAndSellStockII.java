class bestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}


// Time Complexity: O(n). Only a single pass is needed.

// Space complexity: O(1). Constant space, one variable.