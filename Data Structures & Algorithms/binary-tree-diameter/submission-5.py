# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        result = [0]


        def calculateHeight(root):
            if not root:
                return 0
            
            result_left = calculateHeight(root.left)
            result_right = calculateHeight(root.right)

            result[0] = max(result[0], result_left + result_right)

            return 1 + max(result_left, result_right)
        
        calculateHeight(root)

        return result[0]
