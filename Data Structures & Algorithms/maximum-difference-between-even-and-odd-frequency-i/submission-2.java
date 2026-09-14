class Solution {
    public int maxDifference(String s) {
      int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        
        int maxOdd = 0;
        int minEven = Integer.MAX_VALUE;
        
        for (int count : freq) {
            if (count > 0) {
                if (count % 2 != 0) {
                    // Maximum odd frequency
                    maxOdd = Math.max(maxOdd, count);
                } else {
                    // Minimum even frequency
                    minEven = Math.min(minEven, count);
                }
            }
        }
        
        return maxOdd - minEven;
    }
}