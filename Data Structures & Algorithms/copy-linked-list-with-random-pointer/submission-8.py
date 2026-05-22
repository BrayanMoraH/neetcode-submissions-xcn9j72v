"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        oldToNew = {}
        oldToNew[None] = None

        current = head

        while current:
            oldToNew[current] = Node(current.val)
            current = current.next

        current = head

        while current:
            node = oldToNew[current]
            node.next = oldToNew[current.next]
            node.random = oldToNew[current.random]
            current = current.next
        
        return oldToNew[head]
        





        