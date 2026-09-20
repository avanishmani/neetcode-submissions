class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                // Left is empty if at index 0 OR previous element is 0
                boolean emptyLeft = (i == 0 || flowerbed[i - 1] == 0);
                
                // Right is empty if at last index OR next element is 0
                boolean emptyRight = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
                
                // If both left and right are clear, plant a flower here
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // Mark as planted!
                    count++;
                }
            }
        }
        
        return count >= n;
    }
}