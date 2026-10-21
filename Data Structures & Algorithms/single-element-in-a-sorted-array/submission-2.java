class Solution {
    public int singleNonDuplicate(int[] nums) {
       int n = nums.length;
        
        // Edge cases
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

        int i = 1;
        int j = n - 2;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            // Target check: Neighboring elements differ
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // Parity Check:
            // Fast Trick: (mid ^ 1) even index ke liye next odd deta hai
            // aur odd index ke liye previous even index deta hai.
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || 
                (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                // Left half pattern is correct (Even, Odd), move RIGHT
                i = mid + 1;
            } else {
                // Left half pattern is disturbed, single element is on LEFT
                j = mid - 1;
            }
        }

        return -1;
    }
}