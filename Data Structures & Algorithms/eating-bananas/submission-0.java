class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int st = 1;
        int end = 0;
        
        // Find maximum pile size to set the upper bound
        for (int pile : piles) {
            end = Math.max(end, pile);
        }
        
        int ans = end;
        
        while (st <= end) {
            int mid = st + (end - st) / 2;
            
            if (canEatAll(piles, h, mid)) {
                ans = mid;     // mid works, try to find a smaller valid speed
                end = mid - 1;
            } else {
                st = mid + 1;  // mid is too slow, increase speed
            }
        }
        
        return ans; // Or simply return 'st'
    }

    private boolean canEatAll(int[] piles, int h, int k) {
        long hoursNeeded = 0;
        for (int pile : piles) {
            // Equivalent to Math.ceil((double) pile / k) without precision issues
            hoursNeeded += (pile + k - 1) / k;
        }
        return hoursNeeded <= h;
    }
}
