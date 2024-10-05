// LEETCODE 485. Max Consecutive Ones

// Q.  Given a binary array nums, return the maximum number of consecutive 1's in the array.

// T.C : O(n);
// Space : O(1);

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
            
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1) {
                count++;
                maxCount = Math.max(maxCount,count);
            }
            else  count = 0;
        }
        return maxCount;
    }
}