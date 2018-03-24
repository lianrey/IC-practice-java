package com.liana.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liana on 3/7/18.
 */
public class App {
    public static void main(String[] arg){
        //QUESTION 1
        System.out.print(Question1.GetMaxProfit(new int[]{ 10, 7, 5, 11, 9, 2 }));
        System.out.println();

        //QUESTION 2
        int[] result2 = Question2.GetProductsOfAllIntsExceptAtIndex(new int[] {3, 4});
        for (int value : result2)
        {
            System.out.println(value);
        }

        //QUESTION 4
        List<Meeting> meetings = new ArrayList<Meeting>();
        meetings.add(new Meeting(0,12));
        meetings.add(new Meeting(1,2));
        meetings.add(new Meeting(13,22));

        List<Meeting> result4 = Question4.mergeRanges(meetings);
        System.out.println("Question 4");
        for (Meeting meeting : result4)
        {
            System.out.println(meeting.toString() + " ");
        }

        System.out.println("Question 5");
        System.out.println(Question5.ChangePossibilitiesBottomUp(4, new int[]{1,2,3}));
    }
}

