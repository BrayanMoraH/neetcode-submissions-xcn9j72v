class Node:
    def __init__(self, key, value):
        self.key = key
        self.value = value

        self.next = self.prev = None

class LRUCache:

    def __init__(self, capacity: int):
        self.cache = {}
        self.capacity = capacity

        self.left, self.right = Node(0, 0), Node(0, 0)

        self.left.next, self.right.prev = self.right, self.left

    def insert(self, node):
        prev, ntx = self.right.prev, self.right
        prev.next = ntx.prev = node
        node.next = ntx
        node.prev = prev
    
    def remove(self, node):
        prev, nxt = node.prev, node.next
        prev.next = nxt
        nxt.prev = prev

    def get(self, key: int) -> int:
        if key in self.cache:
             self.remove(self.cache[key])
             self.insert(self.cache[key])
             return self.cache[key].value
        return -1
        
    def put(self, key: int, value: int) -> None:
        if key in self.cache:
            self.remove(self.cache[key])
        
        current_node = Node(key, value)
        self.cache[key] = current_node
        self.insert(current_node)

        if len(self.cache) > self.capacity:
            lru = self.left.next
            self.remove(lru)
            del self.cache[lru.key]
    
        
