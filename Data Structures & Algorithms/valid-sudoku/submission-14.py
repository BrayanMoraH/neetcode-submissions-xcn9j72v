class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        col_v = defaultdict(set)
        row_v = defaultdict(set)
        square = defaultdict(set)

        for row in range(9):
            for col in range(9):

                if board[row][col] == '.':
                    continue

                if (board[row][col] in col_v[col] 
                or board[row][col] in row_v[row] 
                or board[row][col] in square[(row // 3, col // 3)]):
                   return False

                row_v[row].add(board[row][col])
                col_v[col].add(board[row][col])
                square[(row // 3, col // 3)].add(board[row][col])
            
        return True
        