package com.liana.examples;

/**
 * Created by liana on 3/24/18.
 */
public class Question5 {
    public static int ChangePossibilitiesBottomUp(int amount, int[] denominations)
    {
        int[] waysOfDoingNCents = new int[amount + 1];
        waysOfDoingNCents[0] = 1;

        for (int coin : denominations)
        {
            for (int higherAmount = coin; higherAmount <= amount; higherAmount++)
            {
                int higherAmountRemainder = higherAmount - coin;
                waysOfDoingNCents[higherAmount] += waysOfDoingNCents[higherAmountRemainder];
            }
        }

        return waysOfDoingNCents[amount];
    }
}
