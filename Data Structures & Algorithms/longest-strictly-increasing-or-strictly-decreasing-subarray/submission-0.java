class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 0;
        int dec = nums.length-1;
        int max = 0;
        int min = 0;
        if(nums.length==1){
            return 1;
        }
        for(int i =1;i< nums.length;i++){
            if(nums[i-1]<nums[i]){
                max = Math.max((i-inc)+1, max);
            }else{
                inc = i;
            }
        }
        for(int i = nums.length-2; i>=0 ;i--){
            if(nums[i+1]<nums[i]){
                min = Math.max((dec-i)+1, min);
            }else{
                dec = i;
            }
        }
        return Math.max(min,max)==0 ? 1 : Math.max(min,max);
    }
}