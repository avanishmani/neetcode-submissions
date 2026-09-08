class Solution {
    public int evalRPN(String[] tokens) {
       ArrayDeque<Integer> st = new ArrayDeque<>();
       for (int i = 0; i < tokens.length; i++) {
        boolean isExp = "+".equals(tokens[i]) || "-".equals(tokens[i])
                || "*".equals(tokens[i]) || "/".equals(tokens[i]);

        if (isExp) {
            int b = st.pop();
            int a = st.pop();

            int res = calculate(a, b, tokens[i]);
            st.push(res);
        } else {
            st.push(Integer.parseInt(tokens[i]));
        }
    }
    return st.peek();

    }
    public int calculate(int total, int prev, String sign){
        if("+".equals(sign)){
            total+=prev;
        }else if("-".equals(sign)){
            total-=prev;
        }else if("*".equals(sign)){
            total*=prev;
        }else{
            total= total/prev;
        }
        return total;
    }
}
