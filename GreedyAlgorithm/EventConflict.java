package GreedyAlgorithm;

// You are given two arrays of strings that represent two inclusive events that happened on the same day, event1 and event2, where:

// event1 = [startTime1, endTime1] and
// event2 = [startTime2, endTime2].
// Event times are valid 24 hours format in the form of HH:MM.

// A conflict happens when two events have some non-empty intersection (i.e., some moment is common to both events).

// Return true if there is a conflict between two events. Otherwise, return false.

/*
 * Problem: Event Conflict Detection
 * Platform: LeetCode (Calendar / Interval Overlap)
 * Category: Greedy / Intervals
 *
 * Approach:
 * - Convert time from "HH:MM" format into total minutes
 * - Compare two intervals
 * - Check if they overlap using interval overlap condition
 *
 * Overlap Condition:
 * Two events overlap if:
 * end1 >= start2 AND end2 >= start1
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

public class EventConflict {

    // Convert "HH:MM" format into total minutes
    public static int convertToTime(String time){
        String part[]=time.split(":");
        int hours=Integer.parseInt(part[0]);
        int min=Integer.parseInt(part[1]);
        return hours*60+min; // retuen times in minutes

    }
    public static boolean eventConflict(String event1[],String event2[]){
        int start1=convertToTime(event1[0]);
        int end1=convertToTime(event1[1]);
        int start2=convertToTime(event2[0]);
        int end2=convertToTime(event2[1]);

        if(end1>=start2 && end2>=start1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String event1[] = {"01:00","02:00"};
        String event2[] = {"04:20","05:00"};

        System.out.println(eventConflict(event1, event2));
    }
    
}
