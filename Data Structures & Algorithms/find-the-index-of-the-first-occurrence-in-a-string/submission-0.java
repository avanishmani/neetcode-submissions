class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
           int i=0;
           int l=needle.length();
           while(i<haystack.length()){
            char ch = haystack.charAt(i);
            char hc = needle.charAt(0);
            if(ch==hc){
                String st = haystack.substring(i,i+l);
                if(st.equals(needle)){
                    return i;
                }
                i++;
            }else{
                i++;
            }

           }
        }
            return -1;
        
    
}
}