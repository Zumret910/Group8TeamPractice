package week10;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxProfit {
    /*
        Max Profit

        Given an array of stock prices on different days calculate the maximum profit you could make buying it on one day and selling oon another.

        It is only possible to buy or sell once on each day

        Ex:
            Input:
                [8,3,3,1,4,9,12,11]
            Output:
                11

                -> Buying on day 4 for $1 and selling on day 7 when it is worth $12 gives the maximum profit of $11
    */
    public static int maxProfitLoop(int[] prices) {
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int max=prices[j]-prices[i];
                if (max > maxProfit){
                    maxProfit=max;
                }
            }
        }
        return maxProfit;
    }

    public static void maxProfit(int[] prices) {
        int lowestPrice=prices[0];
        int highestPrice=prices[0];
        Map<String,Integer> dayAndPrice=new LinkedHashMap<>();
        for (int i = 0; i < prices.length; i++) {
            dayAndPrice.put("Day "+(i+1),prices[i]);
            if (prices[i]<lowestPrice){
                lowestPrice=prices[i];
            }
            if(prices[i]>highestPrice && prices[i]!=lowestPrice){
                highestPrice=prices[i];
            }
        }
        System.out.println(dayAndPrice);
        System.out.println("Maximum Profit: "+(highestPrice-lowestPrice));
        for (Map.Entry<String, Integer> each : dayAndPrice.entrySet()) {

            if (each.getValue() == lowestPrice){
                System.out.println("Buying on the day "+each.getKey());
            }
            if (each.getValue() == highestPrice){
                System.out.println("Selling on the day "+each.getKey());
            }
        }

    }



}
