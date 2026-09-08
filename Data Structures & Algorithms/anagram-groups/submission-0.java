class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>>  map = new HashMap<>();
       for(String st : strs){
        char[] ch = st.toCharArray();
        Arrays.sort(ch);
        String str = new String(ch);
        if(!map.containsKey(str)){
            map.put(str,new ArrayList<>());
        }
        map.get(str).add(st);
       }
       return new ArrayList<>(map.values());

    }
}
