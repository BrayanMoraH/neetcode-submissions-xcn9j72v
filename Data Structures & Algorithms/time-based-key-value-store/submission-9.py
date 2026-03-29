class TimeMap:

    def __init__(self):
        self.groups = {}

    def set(self, key: str, value: str, timestamp: int) -> None:
        if key not in self.groups:
            self.groups[key] = []
        self.groups[key].append([value, timestamp])
        

    def get(self, key: str, timestamp: int) -> str:
        res = ""
        values = self.groups.get(key, [])

        left = 0
        right = len(values) - 1


        while left <= right:
            middle = (left + right) // 2

            if values[middle][1] <= timestamp:
                res = values[middle][0]
                left = middle + 1
            else:
                right = middle -1
        return res
