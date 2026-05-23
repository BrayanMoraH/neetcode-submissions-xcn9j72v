# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        result = self.dfs(root)
        return result[1]

    def dfs(self, root):

        if root is None:
            return [0, True]

        left_value = self.dfs(root.left)
        right_value = self.dfs(root.right)

        is_balanced = (left_value[1] and right_value[1] and abs(left_value[0] - right_value[0]) <= 1)

        max_depth = max(left_value[0], right_value[0]) + 1

        return [max_depth, is_balanced]

        


