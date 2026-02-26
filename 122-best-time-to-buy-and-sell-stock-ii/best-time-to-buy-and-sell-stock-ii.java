class Solution {
    public int maxProfit(int[] prices) {
        int Max_profit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                Max_profit=Max_profit+prices[i+1]-prices[i];
            }
        }
        return Max_profit;

    }
}