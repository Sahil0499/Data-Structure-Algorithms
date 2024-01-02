// Ques. you are given an array prices where prices[i] is the price of a given stock on the ith day.
//       return the maximum profit you can achieve from this traction, if you cannot achieve any profit, return 0


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
