class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Sort array lexicographically
        Arrays.sort(strs);
        
        // Compare only first and last string
        String first = strs[0];
        String last = strs[strs.length - 1];
        int idx = 0;
        
        while (idx < first.length() && idx < last.length()) {
            if (first.charAt(idx) == last.charAt(idx)) {
                idx++;
            } else {
                break;
            }
        }
        
        return first.substring(0, idx);
    }
}