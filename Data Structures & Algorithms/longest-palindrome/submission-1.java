class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1){
            return 1;
        }
        HashMap<Character,Integer> map =new HashMap<>();
        int result =1;
       for(int i=0;i<s.length();i++){   
            char ch =  s.charAt(i);   
            map.put(ch,map.getOrDefault(ch,0)+1);
       } 
      int length = 0;
        boolean hasOdd = false;

        for (Map.Entry<Character, Integer> mp : map.entrySet()) {
            int value = mp.getValue();
            
            if (value % 2 == 0) {
                length += value; // Even frequency: poora include karo
            } else {
                length += value - 1; // Odd frequency: max even portion (value - 1) include karo
                hasOdd = true;       // Track karo ki 1 odd character center mein aa sakta hai
            }
        }

        // Agar ek bhi odd element tha, toh 1 character middle/center mein baith sakta hai
        if (hasOdd) {
            length += 1;
        }

        return length;
}}