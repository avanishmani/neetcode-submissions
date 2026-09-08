class Solution {
    public int climbStairs(int n) {
        int [] dp =new int[n];
        Arrays.fill(dp,-1);
       return calculation(n, 0,dp); 
    }
    public int calculation(int n, int step,int[] dp){
        if(step==n) return 1;
        if(step >n) return 0;
        if(dp[step]!=-1) return dp[step];
        return dp[step]= calculation(n,step+1,dp)+calculation(n,step+2,dp);
    }
}
