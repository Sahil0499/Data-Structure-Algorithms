// LEETCODE 136. Single Number

// Q. Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.

// T.C : O(n);
// Space : O(1);

class Solution {
    public int singleNumber(int[] nums) {
        int XOR = 0;
        for(int i= 0; i<nums.length; i++){
            XOR ^= nums[i];
        }
        return XOR;
    }
}
