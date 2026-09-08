class Solution {
    public boolean isAnagram(String s, String t) {
     int[] arr = new int [28];
     for(char c: s.toCharArray()){
        int i = c-'a';
        arr[i]= arr[i]+1;
     }
     for(char c: t.toCharArray()){
        int i = c-'a';
        arr[i]= arr[i]-1;
     }
     for(int i: arr){
        if(i!=0){
            return false;
        }
     }
     return true;
     
    }
}
