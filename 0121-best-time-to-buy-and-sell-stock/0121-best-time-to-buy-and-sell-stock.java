class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = Integer.MAX_VALUE;
        
        // int i = 1, buy = prices[0];

        // while(i < prices.length){
        //     int sell = prices[i];
        //     max = Math.max(max, sell - buy);
        //     i++;
        //     buy = Math.min(buy, prices[i-1]);
        // }

        for(int i=0; i<prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }else{
                max = Math.max(prices[i] - buy, max);
            }
        }
        return max;
    }
}