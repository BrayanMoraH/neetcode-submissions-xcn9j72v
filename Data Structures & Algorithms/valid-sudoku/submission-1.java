class Solution {
    public boolean isValidSudoku(char[][] board) {
      Map<String, Set<Character>> rows = new HashMap<>();
      Map<String, Set<Character>> cols = new HashMap<>();
      Map<String, Set<Character>> boxes = new HashMap<>();

      for(int row = 0; row < board.length; row++){
        for(int col = 0; col < board[row].length; col++){
            if(board[row][col] == '.') continue;

            if(!rows.containsKey("" + row)){
                rows.put("" + row, new HashSet<>());
            }

            if(!cols.containsKey("" + col)){
                cols.put("" + col, new HashSet<>());
            }

            int rowBox = row / 3;
            int colBox = col / 3;
            if(!boxes.containsKey("" + rowBox + colBox)){
                boxes.put("" + rowBox + colBox, new HashSet<>());
            }

            if(rows.get("" + row).contains(board[row][col]) || 
            cols.get("" + col).contains(board[row][col]) ||
            boxes.get("" + rowBox + colBox).contains(board[row][col])){
                return false;
            }

            rows.get("" + row).add(board[row][col]);
            cols.get("" + col).add(board[row][col]);
            boxes.get("" + rowBox + colBox).add(board[row][col]);
        }
      }

      return true;   
    }
}
