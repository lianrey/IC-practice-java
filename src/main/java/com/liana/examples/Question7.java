package com.liana.examples;

/**
 * Created by liana on 3/24/18.
 */
public class Question7 {
    private int max;

    private int min;

    private double mean;

    private int mode;

    private int total;

    private int numberOfReadings;
    private int[] occurrences = new int[111];  // Array of 0s at indices 0..110
    private int maxOccurrences;

    public void addTemperature(int temperature)
    {
        occurrences[temperature]++;
        if (occurrences[temperature] > maxOccurrences)
        {
            mode = temperature;
            maxOccurrences = occurrences[temperature];
        }

        // For mean
        numberOfReadings++;
        total += temperature;
        mean = (double)total / numberOfReadings;

        max = Math.max(max, temperature);
        min = Math.min(min, temperature);
    }

    public int getMax()
    {
        return max;
    }

        public int getMin()
    {
        return min;
    }

        public double getMean()
    {
        return mean;
    }

        public int getMode()
    {
        return mode;
    }
}
