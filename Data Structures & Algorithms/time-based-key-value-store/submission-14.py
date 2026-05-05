class TimeMap:

    def __init__(self):
        self.key_value = defaultdict(list)

    def set(self, key: str, value: str, timestamp: int) -> None:
        self.key_value[key].append([value, timestamp])

    def get(self, key: str, timestamp: int) -> str:

        current = self.key_value.get(key, [])

        result = ""

        if len(current) == 0:
            return result
        
        left = 0
        right = len(current) - 1

        while(left <= right):

            middle = (left + right) // 2

            if current[middle][1] <= timestamp:
                result = current[middle][0]

            if current[middle][1] > timestamp:
                right = middle - 1
            else:
                left = middle + 1
            
        return result
            


        



        
