class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        map = {}

        for word in strs:
            current_sorted = "".join(sorted(word))

            if current_sorted not in map:
                map[current_sorted] = []
            
            map[current_sorted].append(word)
        
        return list(map.values())

