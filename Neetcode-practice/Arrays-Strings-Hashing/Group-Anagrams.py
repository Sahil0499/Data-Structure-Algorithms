# 49. Group Anagrams
# Given an array of strings strs, group the anagrams together. You can return the answer in any order.

from typing import List
from collections import defaultdict

strs = ["eat","tea","tan","ate","nat","bat"]

# Sorting
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)
        for s in strs:
            sortedS = ''.join(sorted(s))
            res[sortedS].append(s)
        return list(res.values())

# Time complexity : O(m*nlogn)
# Space complexity: O(m*n)
# Where m is the number of strings and n is the length of the longest string.

#Hash Table
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)
        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord('a')] += 1
            res[tuple(count)].append(s)
        return list(res.values())

# Time complexity : O(m*n)
# Space complexity: O(m*n)
# Where m is the number of strings and n is the length of the longest string.

Sol = Solution()
print(Sol.groupAnagrams(strs))