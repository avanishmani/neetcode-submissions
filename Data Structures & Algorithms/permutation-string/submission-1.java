class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[26];
        for(int i =0;i< s1.length();i++){
            int ind =s1.charAt(i)-'a';
            arr[ind]++; 
        }
        for(int i =0; i<=(s2.length()-s1.length());i++){
            if(isPalindrom(arr,i,(i+s1.length()), s2)){
                return true;
            }
        }
        return false;
    }
    public static boolean isPalindrom(int[] arr,int i, int j, String s2){
       int[] temp = arr.clone();

        for (int a = i; a < j; a++) {
            int ind = s2.charAt(a) - 'a';

            if (temp[ind] == 0) return false;
            temp[ind]--;
        }

        return true;

    }
}
