class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       // Frequency array to store count of each remainder (0 to k-1)
        int[] remainderCount = new int[k];
        
        // Base case: A prefix sum of 0 has a remainder of 0 once initially
        remainderCount[0] = 1;
        
        int runningSum = 0;
        int count = 0;
        
        for (int num : nums) {
            runningSum += num;
            
            // Calculate remainder and normalize negative values
            int remainder = runningSum % k;
            if (remainder < 0) {
                remainder += k;
            }
            
            // Add how many times this remainder has been seen before
            count += remainderCount[remainder];
            
            // Increment the count of this remainder
            remainderCount[remainder]++;
        }
        
        return count;

    }
}