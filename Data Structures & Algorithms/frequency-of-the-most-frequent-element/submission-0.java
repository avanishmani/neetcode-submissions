class Solution {
    public int maxFrequency(int[] nums, int k) {
     Arrays.sort(nums);
        int n = nums.length;
        
        // Long array to prevent integer overflow
        long[] pre = new long[n];
        pre[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + nums[i];
        }

        int maxFreq = 1; // Minimum frequency 1 toh hogi hi

        // Har index 'i' ko target banakar piche Binary Search karenge
        for (int i = 0; i < n; i++) {
            int l = 0, r = i;
            int bestL = i;

            while (l <= r) {
                int mid = l + (r - l) / 2;
                
                // Prefix sum formula: Sum from mid to i
                long windowSum = pre[i] - (mid > 0 ? pre[mid - 1] : 0);
                long targetSum = (long) nums[i] * (i - mid + 1);
                
                if (targetSum - windowSum <= k) {
                    bestL = mid; // Valid window, try expanding to the left
                    r = mid - 1;
                } else {
                    l = mid + 1; // Invalid, make window smaller
                }
            }

            maxFreq = Math.max(maxFreq, i - bestL + 1);
        }

        return maxFreq;
    }
}