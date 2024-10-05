### LEETCODE 2149. Rearrange Array Elements by Sign

#### Q. You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.  You should return the array of nums such that the the array follows the given conditions:
##### 1. Every consecutive pair of integers have opposite signs.
##### 2. For all integers with the same sign, the order in which they were present in nums is preserved.
##### 3. The rearranged array begins with a positive integer.
##### 4. Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

>Example:  Input: nums = [3,1,-2,-5,2,-4]  
Output: [3,-2,1,-5,2,-4]  
Explanation:  
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].  
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].  
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions. 


```First Solution```

```java
import java.util.*;
class Solution {
  public int[] rearrangeArray(int[] nums) {
    var res = new int[nums.length];
    var pos = 0;
    var neg = 1;

    for (var num : nums) {
      if (num > 0) {
        res[pos] = num;
        pos += 2;
      } else {
        res[neg] = num;
        neg += 2;
      }
    }
    return res;
  }
}
```
>- TC = O(N) { O(N) for traversing the array once and substituting positives and negatives simultaneously using pointers, where N = size of the array A}.
>- SC = O(N) { Extra Space used to store the rearranged elements separately in an array, where N = size of array A}.
 