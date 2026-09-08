class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> st =new Stack<>();
        for(Character ch: s.toCharArray()){
            if(st.size()==0){
                st.add(ch);
            }else{
                if(ch=='('|| ch=='{'||ch=='['){
                    st.push(ch);
                }else{
                    if(st.isEmpty()){
                        return false;
                    }else if((st.peek()=='(' && ch==')') || 
   (st.peek()=='{' && ch=='}') || 
   (st.peek()=='[' && ch==']')) {
    st.pop();
                }else{
                    return false;
                }
            }
        }
        }
        return st.isEmpty() ? true :false;
    
    }
}
