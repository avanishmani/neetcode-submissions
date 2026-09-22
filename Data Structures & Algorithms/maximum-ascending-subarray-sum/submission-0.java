class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        for(int i =1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                sum+=nums[i];
                max = Math.max(sum,max);
            }else{
                sum = nums[i];
            }
        }
        return max;
    }
}