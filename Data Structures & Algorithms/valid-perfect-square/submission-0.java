class Solution {
    public boolean isPerfectSquare(int num) {
       long st = 1;
        long end = num;

        while (st <= end) {
            long mid = st + (end - st) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                st = mid + 1; 
            } else {
                end = mid - 1; 
            }
        }

        return false;
       
    }
}