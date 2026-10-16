class Solution {
    public int arrangeCoins(int n) {
        long st = 1;
        long end = n;
        long ans = 0;

        while (st <= end) {
            long mid = st + (end - st) / 2;
            long coinsUsed = mid * (mid + 1) / 2;

            if (coinsUsed == n) {
                return (int) mid; // Exact match found
            } else if (coinsUsed < n) {
                ans = mid;      // mid complete rows formed, try for more
                st = mid + 1;
            } else {
                end = mid - 1;  // Too many coins needed, reduce rows
            }
        }

        return (int) ans;  
    }
}