class Solution {
    public String longestCommonPrefix(String[] strs) {
        int ind =0;
        int len = Integer.MAX_VALUE;
        for(String s: strs){
            if(len>s.length()){
                len =s.length();
            }
        }
        StringBuilder sb =new StringBuilder("");
        while(ind< len){
            char ch= strs[0].charAt(ind);
            for(String s: strs){
                if( s.charAt(ind)!= ch){
                    return sb.toString();
                }
            }
            sb.append(ch);
            ind++;
        }
        return sb.toString();
    }
}