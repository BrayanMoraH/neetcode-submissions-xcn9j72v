class Solution {
    public boolean isValidSudoku(char[][] board) {
       Map<Integer, Set<Character>> rows = new HashMap<>();
       Map<Integer, Set<Character>> cols = new HashMap<>();
       Map<String, Set<Character>> square = new HashMap<>();

       for(int i = 0; i < 9; i++){ 
        for(int j = 0; j < 9; j++){
            if(board[i][j] == '.') continue;

            String squareValue = i / 3 + "," + j / 3;

            if(rows.computeIfAbsent(i, k -> new HashSet<>()).contains(board[i][j]) ||
            cols.computeIfAbsent(j, k -> new HashSet<>()).contains(board[i][j]) ||
            square.computeIfAbsent(squareValue, k -> new HashSet<>()).contains(board[i][j])){
                return false;
            }

            rows.get(i).add(board[i][j]);
            cols.get(j).add(board[i][j]);
            square.get(squareValue).add(board[i][j]);
        }
       }

       return true;
    }
}
