class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<String, Set<Character>> rows = new HashMap<>();
        Map<String, Set<Character>> colums = new HashMap<>();
        Map<String, Set<Character>> box = new HashMap<>();

        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                if(board[row][col] == '.') continue;

                if(!rows.containsKey("row" + row)){
                    rows.put("row" + row, new HashSet<>());
                }

                if(!colums.containsKey("col" + col)){
                    colums.put("col" + col, new HashSet<>());
                }
                int boxRow = row/3;
                int boxColumn = col/3;
                
                 
                if(!box.containsKey("" + boxRow + boxColumn)){
                    box.put("" + boxRow + boxColumn, new HashSet<>());
                }

                if(rows.get("row" + row).contains(board[row][col]) || colums.get("col" + col).contains(board[row][col]) || 
                   box.get("" + boxRow + boxColumn).contains(board[row][col])){
                    return false;
                }else {
                    rows.get("row" + row).add(board[row][col]);
                    colums.get("col" + col).add(board[row][col]);
                    box.get("" + boxRow + boxColumn).add(board[row][col]);
                }

            }
        }

        return true;

    }
}
