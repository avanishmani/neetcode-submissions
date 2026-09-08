class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i =0;
        int j= result.length()-1;
        while(i<j){
            if(result.charAt(i) != result.charAt(j)){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}
