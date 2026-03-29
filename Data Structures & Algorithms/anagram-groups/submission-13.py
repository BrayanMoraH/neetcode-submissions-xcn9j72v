class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = {}

        for word in strs:
            word_sorted = "".join(sorted(word))
            groups.setdefault(word_sorted, []).append(word)
        
        return list(groups.values())