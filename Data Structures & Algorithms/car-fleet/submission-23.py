class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        groups = []
        stack = []

        for i in range(len(position)):
            groups.append([position[i], speed[i]])

        groups_sorted = sorted(groups, key=lambda x: x[0], reverse=True)

        for current in groups_sorted:

            result = (target - current[0]) / current[1]

            if len(stack) == 0:
                stack.append(result)
                continue
            
            if result > stack[-1]:
                stack.append(result)

        return len(stack)