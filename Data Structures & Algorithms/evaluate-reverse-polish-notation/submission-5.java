class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String t : tokens){
            if(isOperator(t)){
                int b = st.pop();
                int a = st.pop();
                int res = applyop(t, a,b);
                st.push(res);
            }
            else st.push(Integer.parseInt(t));
        }
        return st.pop();
    }
    static boolean isOperator(String t){
        return t.equals("+")||t.equals("-")||t.equals("*")||t.equals("/");
    }
    static int applyop(String t, int a, int b){
        switch(t){
            case("+"): return a+b;
            case("-"): return a-b;
            case("*"): return a*b;
            case("/"): return a/b;
            default: return -1;
        }
        
    }
}
