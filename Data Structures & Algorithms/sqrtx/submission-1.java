class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x; 
        int i = 1;
        int y = x / 2; 
        
        while (i <= y) {
            int mid = i + (y - i) / 2;
            long z = (long) mid * mid;
            
            if (z == x) {
                return mid;
            } else if (z < x) {
                i = mid + 1;
            } else {
                y = mid - 1;
            }
        }
        
       
        return y;
    }
}