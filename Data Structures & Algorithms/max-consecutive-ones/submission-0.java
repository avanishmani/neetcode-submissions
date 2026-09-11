class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0;
        int count =0;
        for(Integer i: nums ){
            if(i==1){
                count++;
            }else{
                max =Math.max(count,max);
                count =0;
            }
        }
        return Math.max(count,max);
    }
}