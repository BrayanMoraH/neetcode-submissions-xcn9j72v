class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        ROWS = defaultdict(set)
        COLS = defaultdict(set)
        SQUARE = defaultdict(set)

        for i in range(9):
            for j in range(9):

                current = board[i][j]

                if current == ".":
                    continue

                if(current in ROWS[i] or current in COLS[j] or current in SQUARE[i // 3, j // 3]):
                    return False

                
                ROWS[i].add(current)
                COLS[j].add(current)
                SQUARE[i // 3, j // 3].add(current)
            
        return True