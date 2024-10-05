// LEETCODE 125. Valid Palindrome

// Q. A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
// it reads the same forward and backward. Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.

// Palindrome = a string on reversal reads the same

// Time complexity: O(n)
// Space complexity: o(1)

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        s = s.toLowerCase();


        while (i < j) {

            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } else {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
        }

        return true;
    }
}