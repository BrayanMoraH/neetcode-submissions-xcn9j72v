class Solution {
    public boolean exist(char[][] board, String word) {

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(word.charAt(0) == board[i][j] && dfs(board, 0,word, i, j)){
                    return true;
                }
            }
        }

        return false;
        
    }

    public boolean dfs(char [][] board, int count, String word, int i, int j){
        if(count == word.length()){
            return true;
        }

        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count)){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' ';
        boolean result = (dfs(board, count + 1, word, i + 1, j) ||
                          dfs(board, count + 1, word, i - 1, j) ||
                          dfs(board, count + 1, word, i, j + 1) || 
                          dfs(board, count + 1, word, i, j - 1));

        board[i][j] = temp;

        return result;                  
    }
}
