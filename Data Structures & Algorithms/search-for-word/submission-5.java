class Solution {
    int ROW = 0;
    int COL = 0;
    public boolean exist(char[][] board, String word) {
        ROW = board.length;
        COL = board[0].length;

        for(int i = 0; i < ROW; i++){
            for(int j = 0; j < COL; j++){
                if(backtrack(board, word, 0, i, j)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean backtrack(char[][] board, String word, int i, int r, int c){

        if(i == word.length()) return true;

        if(r < 0 || r >= ROW || c < 0 || c >= COL || board[r][c] == '#' || board[r][c] != word.charAt(i)){
            return false;
         }


        char temp = board[r][c]; 
        board[r][c] = '#';

        boolean result =  (backtrack(board, word, i + 1, r -1, c) ||
                           backtrack(board, word, i + 1, r + 1, c) ||
                           backtrack(board, word, i + 1, r, c -1) ||
                           backtrack(board, word, i + 1, r, c + 1));

         board[r][c] = temp;


        return result;
    }
}
