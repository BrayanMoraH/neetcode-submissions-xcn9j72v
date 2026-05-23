# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        current_diameter = [0]
        self.dfs(root, current_diameter)

        return current_diameter[0]

    def dfs(self, root, current_diameter):
        if root is None:
            return 0
        
        left_value = self.dfs(root.left, current_diameter)
        right_value = self.dfs(root.right, current_diameter)

        current_diameter[0] = max(current_diameter[0], left_value + right_value)

        return max(left_value, right_value) + 1







        
        
        
        

        

        