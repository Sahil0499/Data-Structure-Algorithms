# 242. Valid Anagram
# Given two strings s and t, return true if t is an anagram of s, and false otherwise.


#Sorting
def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
            
        return sorted(s) == sorted(t)

# Time complexity : O(nlogn + mlogm)
# Space complexity: O(1)

#Hash Map
def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        countS, countT = {}, {}

        for i in range(len(s)):
            countS[s[i]] = 1 + countS.get(s[i], 0)
            countT[t[i]] = 1 + countT.get(t[i], 0)
        return countS == countT

# Time complexity : O(n + m)
# Space complexity: O(1)