### LEETCODE 121. Best Time to Buy and Sell Stock

#### Q. You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.  Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

>Example 1:  
Input: prices = [7,1,5,3,6,4]  
Output: 5  
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:  
Input: prices = [7,6,4,3,1]  
Output: 0  
Explanation: In this case, no transactions are done and the max profit = 0.  


```First Solution```

```java
import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxPro = Math.max(maxPro, prices[i] - minPrice);
        }
        return maxPro;
    }
}
```
>- TC = O(n)
>- SC = O(1)

```Second Solution```

```java
import java.util.*;
public class buyandsellStocks {
    public static int buynsellstock(int prices[]){
        int  buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i< prices.length; i++){
            if(buyPrice < prices[i]){  // PROFIT           
                int profit = prices[i] - buyPrice;  // TODAY'S PROFIT
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String agrs[]){
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buynsellstock(prices));
    }
}
```

