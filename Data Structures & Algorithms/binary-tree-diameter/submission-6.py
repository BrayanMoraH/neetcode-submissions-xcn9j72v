# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        result = [0]

        def dfs(root):

            if not root:
                return 0
            

            left_value = dfs(root.left)
            right_value = dfs(root.right)

            result[0] = max(result[0],  left_value + right_value)

            return 1 + max(left_value, right_value)
        
        dfs(root)
        
        return result[0]