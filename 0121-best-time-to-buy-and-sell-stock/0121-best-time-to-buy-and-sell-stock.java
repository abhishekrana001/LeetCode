class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int i = 1, buy = prices[0];

        while(i < prices.length){
            int sell = prices[i];
            max = Math.max(max, sell - buy);
            i++;
            buy = Math.min(buy, prices[i-1]);
        }
        return max;
    }
}