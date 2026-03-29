class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == word.charAt(0) && dfs(board, 0, i, j, word)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] board, int count, int i, int j, String word){
        if(count == word.length()){
            return true;
        }

        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || word.charAt(count) != board[i][j]){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' ';

        boolean result = (dfs(board, count + 1, i + 1, j, word) ||
                          dfs(board, count + 1, i - 1, j, word) ||
                          dfs(board, count + 1, i, j + 1, word) ||
                          dfs(board, count + 1, i, j - 1, word));

        board[i][j] = temp;
        return result;
    }
}
