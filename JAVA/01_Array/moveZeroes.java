// LEETCODE 283. Move Zeroes
// Q. Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.

// T.C : O(2n);
// Space : O(1);

class Solution {
    public void moveZeroes(int[] nums) {
        int k = -1; 
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                k = i;
                break;
            }
        }

        if (k == -1) return;

        for(int j=k+1; j<nums.length; j++){
           if(nums[j]!=0){
               int temp = nums[k];
               nums[k] = nums[j];
               nums[j] = temp;
               k++;
            }
        } 
    }
}