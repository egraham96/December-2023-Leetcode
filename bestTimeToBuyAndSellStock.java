//Approach: One Pass
class bestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        
        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            }
            else if (maxProfit < prices[i]- minPrice) {
               maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}

// Time Complexity: O(n). Only a single pass is needed.

// Space complexity: O(1). Only two variables are used.