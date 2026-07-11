class Solution {
    public int maxProfit(int[] prices) {
        int left =0;
        int n = prices.length;
        int right = prices.length-1;
        int maxProfit=Integer.MIN_VALUE;
        int minPrice = prices[0];
       for(int i=0;i<n;i++){
        if(prices[i]<minPrice) minPrice =prices[i];
            
            int profit = prices[i]-minPrice;
            
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
        
    }
}
