class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp =new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(calculate(cost,0,dp),calculate(cost,1,dp));
    }
    public int calculate(int[] cost, int step, int[] dp){
        if(step>=cost.length) return 0;
        if(dp[step]!=-1) return dp[step];
        int oneStep = calculate(cost,step+1,dp);
        int twoStep = calculate(cost,step+2,dp);
        dp[step] = cost[step]+ Math.min(oneStep,twoStep);
        return dp[step]; 
    }
}
