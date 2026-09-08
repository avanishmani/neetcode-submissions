class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp =new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(calculate(cost,0,dp),calculate(cost,1,dp));
    }
    public int calculate(int[] cost, int step, int[] dp){
        if(step>=cost.length) return 0;
        // if(cost[step]!=-1) return cost[step];
        int oneStep = calculate(cost,step+1,dp);
        int twoStep = calculate(cost,step+2,dp);
        // return cost[step]+ Math.min(oneStep,twoStep);
        dp[step] = cost[step]+ Math.min(oneStep,twoStep);
        return dp[step]; 
    }
}
