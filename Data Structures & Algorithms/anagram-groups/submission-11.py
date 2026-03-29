class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        group = {}

        for word in strs:
            word_sorted = ''.join(sorted(word))

            if word_sorted not in group:
                group[word_sorted] = []
            
            group.get(word_sorted).append(word)
        
        return list(group.values())
