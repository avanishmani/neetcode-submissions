class Solution {
    public int majorityElement(int[] nums) {
      int count=1;
      int current = nums[0];
      for(int i=1;i<nums.length;i++){
        if(nums[i]==current){
            count++;
        }else{
            count--;
            if(count==0){
                current = nums[i];
                count= 1;
            }
        }
      } 
      return current; 
    }
}