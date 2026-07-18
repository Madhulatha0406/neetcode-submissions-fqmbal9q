class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ans [] = new int[n];
        for(int i =0;i<n;i++){
            while(!st.isEmpty()&&arr[i]>arr[st.peek()]){
                int idx = st.peek();
        
                ans[idx] = i -st.pop();
            }
            st.push(i);
        }
        return ans;
    }
}
