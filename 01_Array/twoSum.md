
### LEETCODE 1. Two Sum

#### Q. Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice.

>Example:  
Input: nums = [2,7,11,15], target = 9  
Output: [0,1]  
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

```First Solution using HASHMAP```

```java
import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int secondElement = target - nums[i];
            if (map.containsKey(secondElement)){
                ans[0] = map.get(secondElement);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
```
>- TC = O(N* logN)  as the map data structure takes logN time to find an element.
>- SC = O(N) as we use the map data structure. 

```Second Solution using 2 - Pointer Approach```
``` java 
public class Main {
    public static String twoSum(int n, int []arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) left++;
            else right--;
        }
        return "NO";
    }
}
```
> - TC = O(N) + O(N*logN)  The loop will run at most N times. And sorting the array will take N*logN time complexity.  
> - SC = O(1)  as we are not using any extra space.