class Solution {
    public int minSubarray(int[] nums, int p) {
      long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        int target = (int) (totalSum % p);
        // Step 1: If total sum is already divisible by p
        if (target == 0) {
            return 0;
        }
        
        // Map stores: <Prefix Remainder, Latest Index>
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Handles sub-arrays starting at index 0
        
        int currentRem = 0;
        int minLen = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            currentRem = (currentRem + nums[i]) % p;
            
            // Formula: neededRem = (currentRem - target + p) % p
            int neededRem = (currentRem - target + p) % p;
            
            if (map.containsKey(neededRem)) {
                int len = i - map.get(neededRem);
                minLen = Math.min(minLen, len);
            }
            
            // Put/Update the current remainder with its LATEST index
            map.put(currentRem, i);
        }
        
        // Cannot remove the whole array
        return minLen < nums.length ? minLen : -1;  
    }
}