class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        
        groups = []
        results = []

        for index in range(len(position)):
            groups.append([position[index], speed[index]])

        groups.sort(key=lambda x: x[0], reverse=True)

        print(groups)

        for group in groups:
            result = (target - group[0]) / group[1]

            print(result) 

            if len(results) > 0  and result > results[-1]:
                results.append(result)
            elif len(results) == 0:
                results.append(result)

        return len(results)