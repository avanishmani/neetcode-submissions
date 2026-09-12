class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for (int j=0;j< words.length;j++){
            String st = words[j];
            for(int i=0;i<words.length;i++){
                if((i!=j) && words[i].contains(st)){
                    System.out.println("St is : "+ st + " and the words at persent is :"+ words[i]);
                    result.add(st);
                    break;
                }
            }
        }
        
        return result;
    }
}