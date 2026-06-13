# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        result = [0]
        self.dfs(result, root)
        return result[0]

    def dfs(self, result, root):
        if root is None:
            return 0
        
        left_value = self.dfs(result, root.left)
        right_value = self.dfs(result, root.right)

        result[0] = max(result[0], left_value + right_value)

        return max(left_value, right_value) + 1