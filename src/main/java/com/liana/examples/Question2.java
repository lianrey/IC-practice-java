package com.liana.examples;

/**
 * Created by liana on 3/11/18.
 */
public class Question2 {
    public static int[] GetProductsOfAllIntsExceptAtIndex(int[] intArray)
    {
        if(intArray.length < 2){
            throw new IllegalArgumentException("Getting the product of numbers at other indices requires at least 2 numbers");
        }
        int[] resultBefore = new int[intArray.length];
        int productSoFar = 1;

        for(int i=0; i < intArray.length; i++){
            resultBefore[i] = productSoFar;
            productSoFar *= intArray[i];
        }

        int[] resultFinal = new int[intArray.length];
        productSoFar = 1;
        for(int i = intArray.length-1; i >= 0; i--){
            resultFinal[i] = productSoFar * resultBefore[i];
            productSoFar *= intArray[i];
        }

        return resultFinal;
    }
}
