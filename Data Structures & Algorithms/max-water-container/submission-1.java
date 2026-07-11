class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int l=0;
        int r = n-1;
        int maxArea= Integer.MIN_VALUE;
        while(l<r){
            int max =(r-l)*Math.min(heights[l],heights[r]);
            if(heights[r]>=heights[l])l++;
            else r--;
            maxArea = Math.max(maxArea,max);
        }
        return maxArea;
    }
}
