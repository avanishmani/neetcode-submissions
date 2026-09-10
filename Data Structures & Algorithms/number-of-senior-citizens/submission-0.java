class Solution {
    public int countSeniors(String[] details) {
        int count =0;
        for(String st: details){
            int age = Integer.parseInt(st.substring(11,13));
            // System.out.println(st + "  -> "+ age);
            if(age>60){
                count++;
                }
        }
        return count;
    }
}