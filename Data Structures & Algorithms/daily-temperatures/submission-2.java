class Solution {
    public int[] dailyTemperatures(int[] temp) {
    int n = temp.length;
    int[] res = new int[n];
    Stack<Integer> st =new Stack<>();
    for(int i=n-1;i>=0;i--){
        if(st.isEmpty()){
           res[i]= 0;
           st.push(i);
        }else{
            while(!st.isEmpty() && temp[st.peek()]<=temp[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                res[i] = st.peek()-i;
            }else{
                res[i] =0;
            }
            st.push(i);

        }
    }

     return res;   
    }
}
