class Solution {
    public boolean isValid(String s) {
        Stack<Character> st =new Stack<>();
        for(Character ch: s.toCharArray()){
            if(st.size()==0){
                st.add(ch);
            }else{
                Character c= st.peek();
                if((c=='(' && ch==')')||
                (c=='{' && ch=='}')||
                (c=='[' && ch==']')){
                    
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }
        return st.isEmpty() ? true :false;
    
    }
}
