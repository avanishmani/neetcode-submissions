class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        int i =1;
        while(i<numRows){
            List<Integer> li = new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0){
                    li.add(1);
                }else{
                    List<Integer> l = result.get(result.size()-1);
                    
                        li.add(l.get(j)+l.get(j-1));
                    
                }
            }
            li.add(1);
            result.add(li);
            i++;
        }
        return result;
    }
}