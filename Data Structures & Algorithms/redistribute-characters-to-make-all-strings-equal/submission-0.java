class Solution {
    public boolean makeEqual(String[] words) {
        int n = words.length;
        
        // Array to store frequency of lowercase English letters
        int[] freq = new int[26];
        
        // Step 1: Count frequency of all characters across all strings
        for (String word : words) {
            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }
        }
        
        // Step 2: Check if each character frequency is divisible by 'n'
        for (int count : freq) {
            if (count % n != 0) {
                return false;
            }
        }
        
        return true;
    }
}