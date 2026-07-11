class Solution {
    public int maxProfit(int[] prices) {
      
        int n = prices.length;
      
        int maxProfit=0;
        int minPrice = prices[0];
       for(int i=0;i<n;i++){
        if(prices[i]<minPrice) minPrice =prices[i];
            
            int profit = prices[i]-minPrice;
            
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
        
    }
}
