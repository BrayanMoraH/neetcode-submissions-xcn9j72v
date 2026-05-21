class Node:
    def __init__(self, key: int, value: int):
        self.key = key
        self.value = value
        self.next = self.prev = None

class LRUCache:

    def __init__(self, capacity: int):
        self.capacity = capacity
        self.values = {}

        self.left, self.right = Node(0, 0), Node(0, 0)
        self.left.next, self.right.prev  = self.right, self.left

    def insert(self, node):
        prev, nxt = self.right.prev, self.right
        prev.next = nxt.prev = node
        node.next = nxt
        node.prev = prev
    
    def delete(self, node):
        prev, nxt = node.prev, node.next
        prev.next = nxt
        nxt.prev = prev

    def get(self, key: int) -> int:
        if key in self.values:
            current = self.values.get(key)
            self.delete(current)
            self.insert(current)
            return current.value

        return -1
        
        
    def put(self, key: int, value: int) -> None:
        if key in self.values:
            current_node = self.values[key]
            self.delete(current_node)
           
        self.values[key] = Node(key, value)
        self.insert(self.values[key])

        if len(self.values) > self.capacity:
            lru = self.left.next
            self.delete(lru)
            del self.values[lru.key]
            


        
