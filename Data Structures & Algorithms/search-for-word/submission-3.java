class Solution {
    public boolean exist(char[][] board, String word) {
      for(int i = 0; i < board.length; i++){
        for(int j = 0; j < board[i].length; j++){
            if(word.charAt(0) == board[i][j] && dfs(i, j, word, board, 0)){
                return true;
            }
        }
      }

      return false;  
    }

    public boolean dfs(int i, int j, String word, char [][] board, int count){
        if(count == word.length()){
            return true;
        }

        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || word.charAt(count) != board[i][j]){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' ';
        
        boolean result = (dfs(i + 1, j, word, board, count +1) ||
                         dfs(i -1, j, word, board, count +1) || 
                         dfs(i, j + 1, word, board, count +1) ||
                         dfs(i, j -1, word, board, count+1));

        board[i][j] = temp;                 
        return result;                 
    }
}
