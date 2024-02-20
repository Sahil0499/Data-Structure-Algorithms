# Know Basic Maths
### Digits (Imp.)

- modulo 10 (%10): will give you reminder.
  <pre>  Ex: 7789 % 10 = 9 </pre>
- division by (/10): will give you the   integer portion.
  <pre> Ex: 7789 / 10 = 778.9 = 778 Ans.  
       7 / 10 = 0 </pre>

  > Psuedo Code (Extraction of Digit / Count the no. of digits)
    <pre>  count = 0;                            T.C = O(Log(N))
    N = 7789;
      While (N > 0)
      {
          lastDigit = W % 10;
          count++;
          W = N/10;
      } Print(count); </pre>
  > NOTE: If no. of Iterations is based on division, Time Complexity will always be Logarithmic.

### Palindrome 
  Palindrome are the numbers for which REVERSE IS EXACTLY SAME.  
  Ex: 121, 1331.

### Armstrong Number 
  An integer such that the sum of the cubes of its digits is equal to the number itself.  
  Ex: 371 = 3^3 + 7^3 + 1^3 = 371.  
  &nbsp;  1634 = 1^3 + 6^3 + 3^3 + 4^3 = 1634.

### Prime Number  
   A prime number is a number that can only be divisible by 1 and the number itself.  
   Ex: 2, 3, 5, 7, 11, etc.

### GCD / HCF ?

> Fibonacci numbers are a sequence of numbers in mathematics where each number is the sum of the two previous numbers

> Palindrome = a string on reversal reads the same
