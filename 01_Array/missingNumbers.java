// LEETCODE 268. Missing Number

// Q. Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array. 

// T.C : O(n);
// Space : O(1);

class Solution {
    public int missingNumber(int[] nums) {
      int XOR1 = 0, XOR2 = 0;
      for(int i=0; i<nums.length; i++){
          XOR1 = XOR1 ^ (i+1);
          XOR2 = XOR2 ^ nums[i];   
      }
      return XOR1 ^ XOR2;
    }
}

// 2 ^ 2 = 0 , 
// 0 ^ 2 = 2

// another approach will be using sum method (sum = n(n+1)/2)
// take the sum of '0' to 'n' numbers, say S1
// and take the sum of numbers present in an array, say S2
// S1 - S2 will give you the missing number, but doing n(n+1)/2 will may go out of bound as max size of array is 10^7