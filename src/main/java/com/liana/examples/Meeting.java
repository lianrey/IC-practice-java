package com.liana.examples;

/**
 * Created by liana on 3/14/18.
 */
public class Meeting
{
    public int startTime;

    public int endTime;

    public Meeting(int startTime, int endTime)
    {
        // Number of 30 min blocks past 9:00 am
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime(){
        return this.startTime;
    }

    public int setStartTime(int startTime){
        return this.startTime = startTime;
    }

    public int getEndTime(){
        return this.endTime;
    }

    public int setEndTime(int entTime){
        return this.endTime = endTime;
    }

    public String toString()
    {
        return "(" + this.startTime + ", " + this.endTime + ")";
    }
}
