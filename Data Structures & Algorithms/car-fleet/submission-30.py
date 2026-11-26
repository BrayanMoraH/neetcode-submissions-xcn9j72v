class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        n = len(position)
        stack = []

        groups = [[0] * 2 for _ in range(n)]

        for index in range(n):
            groups[index][0] = position[index]
            groups[index][1] = speed[index]

        sorted_groups = sorted(groups, key=lambda x: x[0], reverse=True)
        
        for current in sorted_groups:
            result = (target - current[0]) / current[1]

            if not stack:
                stack.append(result)
                continue
            
            if result > stack[-1]:
                stack.append(result)

        return len(stack)

