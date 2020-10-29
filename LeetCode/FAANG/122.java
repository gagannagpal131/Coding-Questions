class Solution {
    public int maxProfit(int[] prices) {

        int startPrice = prices[0];
        int totalProfit = 0;

        for(int i = 1; i < prices.length; i++){

            if(prices[i-1] < prices[i])
                totalProfit = totalProfit + prices[i] - prices[i-1];
        }

        return totalProfit;
    }
}
