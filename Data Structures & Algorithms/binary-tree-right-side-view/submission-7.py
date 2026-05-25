# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        result = []

        queue = deque()
        queue.append(root)

        while queue:
            max_value = 0

            for i in  range(len(queue)):
                node = queue.popleft()

                if node:
                    max_value = max(max_value, node.val)
                    queue.append(node.left)
                    queue.append(node.right)
                
            if max_value != 0:
                result.append(max_value)
        
        return result