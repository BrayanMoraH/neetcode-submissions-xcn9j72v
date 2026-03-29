class TimeMap:

    def __init__(self):
        self.groups = {}

        

    def set(self, key: str, value: str, timestamp: int) -> None:
        if key not in self.groups:
            self.groups[key] = []
        
        self.groups[key].append([timestamp, value])
        

    def get(self, key: str, timestamp: int) -> str:
        result = "" 
        values = self.groups.get(key, [])

        left = 0
        right = len(values) - 1

        while left <= right:
            middle = (left + right) // 2

            if values[middle][0] <= timestamp:
                result = values[middle][1]
                left = middle + 1
            else:
                right = middle - 1
        
        return result

