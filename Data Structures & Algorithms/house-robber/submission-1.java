class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return Math.max(calculate(nums,0,dp),calculate(nums,1,dp));
    }

    public int calculate(int[] nums, int postion,int[] dp){

        if(postion>= nums.length) return 0;
        if(dp[postion]!=-1) return dp[postion];
        return dp[postion]=nums[postion]+Math.max(calculate(nums,postion+2,dp),calculate(nums,postion+3,dp));
    }
}
