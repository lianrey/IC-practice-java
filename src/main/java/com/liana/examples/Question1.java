package com.liana.examples;

/**
 * Created by liana on 3/7/18.
 */
public class Question1 {
    public static int GetMaxProfit(int[] stockPricesYesterday)
    {
        if(stockPricesYesterday.length <2){
            throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
        }

        // Calculate the max profit
        int minPrice = stockPricesYesterday[0];
        int max = stockPricesYesterday[1] - stockPricesYesterday[0];

        for (int i = 1; i < stockPricesYesterday.length; i++){

            int currentPrice = stockPricesYesterday[i];

            int potentialProfit = currentPrice - minPrice;

            max = Math.max(max, potentialProfit);

            minPrice = Math.min(minPrice, currentPrice);
        }

        return max;
    }
}

