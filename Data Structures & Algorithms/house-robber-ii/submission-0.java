class Solution {
    public int rob(int[] nums) {
        if(nums.length<=1) return nums[nums.length-1];
       int[] dp =new int[nums.length];
       Arrays.fill(dp,-1); 
       int omax = calculateFromOrigin(nums,0,dp) ;
       Arrays.fill(dp,-1); 
       int max = calculate(nums,1,dp);
       return Math.max(omax,max);
    }

    public int calculateFromOrigin(int[] arr, int step, int[] dp){
        if(step>=arr.length-1) return 0;
        if(dp[step]!=-1) return dp[step];
        int count = arr[step] + calculateFromOrigin(arr,step+2,dp);
        int notCount = calculateFromOrigin(arr, step+1,dp);
        return dp[step]= Math.max(count,notCount);
    }

    public int calculate(int[] arr, int step, int[] dp){
        if(step>=arr.length) return 0;
        if(dp[step]!=-1) return dp[step];
        int count = arr[step] + calculate(arr,step+2,dp);
        int notCount = calculate(arr, step+1,dp);
        return dp[step]= Math.max(count,notCount);
    }
}