class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            char c1 = s.charAt(i);
            char c2 = t.charAt(j);
            if(c1==c2){
                i++;j++;
            }else{
                j++;
            }
        }
        return i==s.length() ? true : false;
    }
}