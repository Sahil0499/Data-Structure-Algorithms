# Know Basic Maths
### Digit (Imp.)

- modulo 10 (%10): will give you reminder.
  <pre>  Ex: 7789 % 10 = 9 </pre>
- division by (/10): will give you the   integer portion.
  <pre> Ex: 7789 / 10 = 778.9 = 778 Ans.  
       7 / 10 = 0 </pre>

  > Extraction of Digit (Psuedo Code)
    <pre>  N = 7789;
      While (N > 0)
      {
          lastDigit = W % 10;
          W = N/10;
      } </pre>