package com.hkjc.racingtouch.manager;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	String a[] = { "MeetingVenue", "Distance", "LastSixRecords", "Draw", "Ability", "Condition", "JockeyCode", "RunningStyleAll", "IdealDistance", "DistanceTotalRuns",
			 		"DistanceTotalRuns", "DistanceFirst", "DistanceSecond", "DistanceThird"};
	
	public List<List<String>> getCombinations(){
		List<List<String>> combinations = new ArrayList<List<String>>();
		
		final int maxbit = 1 << a.length;

        for (int p = 0; p < maxbit; p++) {
            final List<String> res = new ArrayList<String>();

            for (int i = 0; i < a.length; i++) {
                if ((1 << i & p) > 0) {
                    res.add(a[i]);
                }
            }
            combinations.add(res);
        }
        
        System.out.println("Total Combinations: " + combinations.size());
        System.out.println(combinations);
        
        return combinations;
	}
	
	public static void main(String[] args) {
		new Combinations().getCombinations();
	}
}