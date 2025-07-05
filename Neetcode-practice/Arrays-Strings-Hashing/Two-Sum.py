# 1. Two Sum
# Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
# You may assume that each input would have exactly one solution, and you may not use the same element twice.
# You can return the answer in any order.

from typing import List

#Brute Force
def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]
        return []

# Time complexity : O(n^2)
# Space complexity: O(1)

#Hash Map (One Pass)
def twoSum(self, nums: List[int], target: int) -> List[int]:
    prevMap = {} #val : index

    for i,n in enumerate(nums): # enumerate() is a built-in Python function that allows you to loop over a list while keeping track of both: the index (i) | the value (n)
        diff = target - n
        if diff in prevMap:
            return [prevMap[diff], i]
        prevMap[n] = i

# Time complexity : O(n)
# Space complexity: O(n)