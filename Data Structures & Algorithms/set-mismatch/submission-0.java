class Solution {
    public int[] findErrorNums(int[] nums) {
      int n = nums.length;
        int[] count = new int[n + 1]; // 1-based indexing for numbers 1 to N
        
        // Count frequency of each number in nums
        for (int num : nums) {
            count[num]++;
        }
        
        int duplicate = -1;
        int missing = -1;
        
        // Check frequencies from 1 to N
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                duplicate = i;
            } else if (count[i] == 0) {
                missing = i;
            }
        }
        
        return new int[]{duplicate, missing};  
    }
}