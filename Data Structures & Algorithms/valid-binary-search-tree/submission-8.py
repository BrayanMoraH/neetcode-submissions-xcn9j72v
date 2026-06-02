# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        return self.isValid(root, float('-inf'), float('inf'))
        
    def isValid(self, root, left, right):
        if root is None:
            return True
        
        is_valid = False

        if left < root.val and root.val < right:
            is_valid = True

        left_result = self.isValid(root.left, left, root.val)
        right_result = self.isValid(root.right, root.val, right)

        return left_result and is_valid and right_result