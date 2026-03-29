class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        groups = []
        stack = []

        for index in range(len(position)):
            groups.append([position[index], speed[index]])
        
        groups.sort(key=lambda x:x[0])

        for values in reversed(groups):
            time = (target - values[0]) / values[1]

            if len(stack) == 0:
                stack.append(time)
                continue
            
            while time > stack[-1]:
                stack.append(time)         

        return len(stack)