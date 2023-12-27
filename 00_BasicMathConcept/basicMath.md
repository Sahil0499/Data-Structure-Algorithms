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