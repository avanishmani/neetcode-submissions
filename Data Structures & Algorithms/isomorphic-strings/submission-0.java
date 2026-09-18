class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Character> maps = new HashMap<>();
        HashMap<Character, Character> mapt = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            Character s1= s.charAt(i);
            Character s2= t.charAt(i);
            if(maps.containsKey(s1)){
                if(maps.get(s1)!=s2){
                    return false;
                }
            }
            if(mapt.containsKey(s2)){
                if(mapt.get(s2)!=s1){
                    return false;
                }
            }
            maps.put(s1,s2);
            mapt.put(s2,s1);
        }
        return true;

    }
}