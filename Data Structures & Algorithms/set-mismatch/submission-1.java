class Solution {
    public int[] findErrorNums(int[] nums) {
        int value =-1;
        Arrays.sort(nums);
        int sum =0;
        for(int i=0;i<nums.length;i++){
            if(i!=0){
                if(nums[i]==nums[i-1]){
                    value=nums[i];
                }
            }
            sum+=nums[i];
        }
        int n = nums.length;
        int cum =(n*(n+1))/2;
        return new int[]{value, value + (cum - sum)};

    }
}