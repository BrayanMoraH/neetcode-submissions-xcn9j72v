class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        groups = []
        stack = []

        for i in range(len(position)):
            groups.append([position[i], speed[i]])
        
        sorted_groups = sorted(groups, key=lambda x: x[0], reverse=True)
        
        for i in range(len(sorted_groups)):
            current = sorted_groups[i]
            current_result = (target - current[0]) / current[1]
            print(current_result)

            if len(stack) == 0:
                stack.append(current_result)
                continue
            
            if current_result > stack[-1]:
                stack.append(current_result)

        return len(stack)
        