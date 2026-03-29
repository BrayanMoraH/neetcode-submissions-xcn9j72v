class Solution {
    public List<List<String>> solveNQueens(int n) {
        char [][] board = new char[n][n];
        List<List<String>> result = new ArrayList<>();

        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                board[row][col] = '.';
            }
        }   

        backtrack(n, board, 0, result);

        return result;
    }

    public void backtrack(int n, char[][] board, int row, List<List<String>> result){
        if(row == n){
            List<String> output = new ArrayList<>();
            for(char [] current: board){
                output.add(new String(current));
            }

            result.add(output);
            return;
        }

        for(int i = 0; i < n; i++){
            if(isValid(row, i, board, n)){
                board[row][i] = 'Q';
                backtrack(n, board, row + 1, result);
                board[row][i] = '.';
            }
        }
    }

    public boolean isValid(int row, int col, char[][] board, int n){
        for(int i = 0; i < n; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        for(int i = row - 1,  j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        for(int i = row -1, j = col + 1; i >= 0 && j < n; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
}
