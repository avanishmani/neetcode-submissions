class Solution {
    public int climbStairs(int n) {
       return calculation(n, 0); 
    }
    public int calculation(int n, int step){
        if(step==n) return 1;
        if(step >n) return 0;
        return calculation(n,step+1)+calculation(n,step+2);
    }
}
