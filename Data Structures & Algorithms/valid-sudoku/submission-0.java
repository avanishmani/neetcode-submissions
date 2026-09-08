class Solution {
    public boolean isValidSudoku(char[][] board) {
        // rows
        for(int i=0;i<9;i++){
            if(checkRow(board,i)) return false;
        }
        
        // columns
        for(int j=0;j<9;j++){
            if(checkCol(board,j)) return false;
        }
        
        // 3x3 boxes
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(checkBox(board,i,j)) return false;
            }
        }
        
        return true;
    }
    
   private boolean checkRow(char[][] b, int i){
        HashSet<Character> set = new HashSet<>();
        for(int j=0;j<9;j++){
            if(b[i][j]=='.') continue;
            if(!set.add(b[i][j])) return true;
        }
        return false;
    }
    
    private boolean checkCol(char[][] b, int j){
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<9;i++){
            if(b[i][j]=='.') continue;
            if(!set.add(b[i][j])) return true;
        }
        return false;
    }
    
    private boolean checkBox(char[][] b, int r, int c){
        HashSet<Character> set = new HashSet<>();
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(b[i][j]=='.') continue;
                if(!set.add(b[i][j])) return true;
            }
        }
        return false;
    }
}
