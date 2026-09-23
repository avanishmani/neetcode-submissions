class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
       HashMap<Integer, Boolean> map = new HashMap<>();
       for(int i =0;i< words.length;i++){
        String st = words[i];
        char start = st.charAt(0);
        char end = st.charAt(st.length()-1);
        if(isVowel(start) &&isVowel(end)){
            map.put(i,true);
        }else{
            map.put(i, false);
        }
       } 
       int[] result =new int[queries.length];
       
       for(int i =0;i<queries.length;i++){
        int[] arr = queries[i];
        int start = arr[0];
        int end = arr[1];
        result[i] = calcuate(start,end, map);
       }
       return result;
    }
    public static boolean isVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u'){
            return true;
        }
        return false;
    }


    public static int calcuate(int start,int end,HashMap<Integer, Boolean> map){
        int i =start;
        int count =0;
        while(i<=end){
           
              if(map.get(i++)){
                count++;
              }
            
        }
        return count;
    }
}