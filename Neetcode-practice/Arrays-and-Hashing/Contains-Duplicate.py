from typing import List

# 217. Contains Duplicate
# Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

#Brute Force
def hasDuplicate(self, nums: List[int]) -> bool:
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            if nums[i] == nums[j]:
                return True
    return False

# Time complexity : O(n^2)
# Space complexity: O(1)

#Sorting
def hasDuplicate(self, nums: List[int]) -> bool:
        nums.sort()
        for i in range(1, len(nums)):
            if nums[i] == nums[i - 1]:
                return True
        return False

# Time complexity : O(nlogn)
# Space complexity: O(1)

# Hash Set (optimise one but have to compromise with space complex.)
def hasDuplicate(self, nums: List[int]) -> bool:
       seen = set()
       for num in nums:
           if num in seen:
               return True
           seen.add(num)
       return False

# Time complexity : O(n)
# Space complexity: O(n)