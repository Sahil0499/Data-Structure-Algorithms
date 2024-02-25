// LEETCODE 53. Maximum Subarray
// Ques. Given an integer array nums, find the subarray with the largest sum, and return its sum.

// APPROACH - main thing is adding +ve number with big -ve number will always give result of negative number,
// Kadane's take this number as 0.

// T.C -  O(N)

public class kadanealgo {
    public static void Kadanes(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            currentSum +=  numbers[i];
            maxSum = Math.max(currentSum, maxSum);
             
            if (currentSum < 0) currentSum = 0;
           
        }
        System.out.println(" max subarray sum is : " + maxSum);
    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
       
        Kadanes(numbers);
    }
}
