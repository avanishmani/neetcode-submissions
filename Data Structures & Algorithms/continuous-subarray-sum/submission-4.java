class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Map stores: <Remainder, First Occurring Index>
        Map<Integer, Integer> remainderMap = new HashMap<>();
        
        // Base case: remainder 0 at index -1 handles subarrays starting from index 0
        remainderMap.put(0, -1);
        
        int runningSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            
            int remainder = runningSum % k;
            
            if (remainderMap.containsKey(remainder)) {
                // Check if length of subarray is at least 2
                if (i - remainderMap.get(remainder) >= 2) {
                    return true;
                }
            } else {
                // Only store the FIRST occurrence of a remainder to keep the longest distance
                remainderMap.put(remainder, i);
            }
        }
        
        return false;
    }
}