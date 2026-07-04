class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = defaultdict(set)
        cols = defaultdict(set)
        square = defaultdict(set)

        for i in range(9):
            for j in range(9):

                current = board[i][j]

                if current == ".":
                    continue
                
                if(current in rows[i] or current in cols[j] or current in square[i // 3, j // 3]):
                    return False
                
                rows[i].add(current)
                cols[j].add(current)
                square[i // 3, j // 3].add(current)
        
        return True