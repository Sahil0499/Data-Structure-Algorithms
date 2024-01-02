// LEETCODE 189. Rotate Array

// Q. Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= nums.length;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        
    }

// constant time
    public void reverse(int[] nums, int felement, int lelement ){
            while (felement < lelement) {
            int temp = nums[felement];
            nums[felement] = nums[lelement];
            nums[lelement] = temp;
            felement++;
            lelement--;
        }
    }
}