class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        most_repeated = 0
        visited = defaultdict()
        result = 0

        left = 0
        right = 0

        while right < len(s):
            current = s[right]

            visited[current] = visited.get(current, 0) + 1

            most_repeated = max(most_repeated, visited[current])

            while ((right - left) + 1) - most_repeated > k:
                current_left = s[left]
                visited[current_left] = visited[current_left] - 1
                left += 1
            
            result = max((right - left) + 1, result)
            right += 1
        
        return result

            

            

