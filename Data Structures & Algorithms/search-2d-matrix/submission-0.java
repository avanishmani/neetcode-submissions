class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        
        int col = getRowIndex(matrix, target); 
        
        if (col == -1) return false;
        
        return searchInRow(matrix, target, col);
    }
    
    // Step 1: Find the correct row using binary search on first column
    private static int getRowIndex(int[][] mat, int target) {
        int left = 0;
        int right = mat.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (mat[mid][0] == target) {
                return mid;                    // target first column mein hi mil gaya
            } 
            else if (mat[mid][0] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        
        return right;   
    }
    
    // Step 2: Us row mein normal binary search
    private static boolean searchInRow(int[][] mat, int target, int row) {
        if (row < 0 || row >= mat.length) return false;
        
        int left = 0;
        int right = mat[0].length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = mat[row][mid];
            
            if (val == target) {
                return true;
            } 
            else if (val < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return false;
    }
}