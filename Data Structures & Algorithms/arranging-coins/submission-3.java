class Solution {
    public int arrangeCoins(int n) {
        int row = 1; // 1st row se shuru karenge
        
        while (n >= row) {
            n -= row; // Current row complete karne ke liye coins minus kar do
            row++;    // Agli row par jao
        }
        
        return row - 1; // Kitni complete rows bani
    }
}