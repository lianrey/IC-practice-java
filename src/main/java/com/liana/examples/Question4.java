package com.liana.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by liana on 3/14/18.
 */
public class Question4 {
    public static List<Meeting> mergeRanges(List<Meeting> meetings)
    {
        List<Meeting> sortedMeetings = new ArrayList<>();
        for(Meeting meeting: meetings){
            Meeting meetingCopy = new Meeting(meeting.getStartTime(), meeting.getEndTime());
            sortedMeetings.add(meetingCopy);
        }

        Collections.sort(sortedMeetings, new Comparator<Meeting>(){
            public int compare(Meeting m1, Meeting m2){
                return m1.getStartTime() - m2.getStartTime();
            }
        });

        List<Meeting> mergedMeetings = new ArrayList<>();
        mergedMeetings.add(sortedMeetings.get(0));

        // Merge meeting ranges
        for(Meeting currentMeeting : sortedMeetings){
            Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size()-1);

            if(currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime())
            {
                lastMergedMeeting.setEndTime(Math.max(lastMergedMeeting.getEndTime(), currentMeeting.getEndTime()));
            }
            else{
                mergedMeetings.add(currentMeeting);
            }
        }

        return mergedMeetings;
    }

}