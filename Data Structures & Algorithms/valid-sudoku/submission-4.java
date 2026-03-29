class Solution {
    public boolean isValidSudoku(char[][] board) {

        //validate rows
        for(int row  = 0; row < 9; row++){
            Set<Character> seen = new HashSet<>();
            for(int i = 0; i < 9; i++){
                char current = board[row][i];
                if(seen.contains(current)) return false;
                if(current != '.') {
                    seen.add(current);
                }
            }
        }

        //validate columns
        for(int col  = 0; col < 9; col++){
            Set<Character> seen = new HashSet<>();
            for(int i = 0; i < 9; i++){
                char current = board[i][col];
                if(seen.contains(current)) return false;
                if(current != '.') {
                    seen.add(current);
                }
            }
        }

        //validate square
        for(int square = 0; square < 9; square++){
            Set<Character> seen = new HashSet<>();
            for(int row = 0; row < 3; row++){
                for(int col = 0; col < 3; col++){
                    int currentRow = (square / 3) * 3 + row;
                    int currentCol = (square % 3) * 3 + col;

                    if(seen.contains(board[currentRow][currentCol])) return false;

                    if(board[currentRow][currentCol] != '.'){
                        seen.add(board[currentRow][currentCol]);
                    }
                }
            }
        }


        return true;

    }
}
