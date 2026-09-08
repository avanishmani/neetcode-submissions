class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return Math.min(calculate(cost,0),calculate(cost,1));
    }
    public int calculate(int[] cost, int step){
        if(step>=cost.length) return 0;
        return cost[step]+Math.min(calculate(cost,step+1),calculate(cost,step+2)); 
    }
}
