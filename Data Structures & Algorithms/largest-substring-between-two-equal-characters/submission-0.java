class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
       HashMap<Character,Integer> map =new HashMap<>();
       int result =-1;
       for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           if(map.containsKey(ch)){
            int j =map.get(ch);
            int diff = (s.substring(j,i).length())-1;
            result = Math.max(result,diff);
           }else{
            map.put(ch,i);
           }
       } 
       return result;
    }
}