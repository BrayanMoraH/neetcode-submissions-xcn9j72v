# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        result = []

        queue = deque()
        queue.append(root)

        while queue:
            level = []

            for i in range(len(queue)):
                current_node = queue.popleft()

                if current_node:
                    level.append(current_node.val)
                    queue.append(current_node.left)
                    queue.append(current_node.right)
                
            if len(level) > 0:
                result.append(level)
            
        return result
