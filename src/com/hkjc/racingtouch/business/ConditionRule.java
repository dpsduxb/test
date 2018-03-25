package com.hkjc.racingtouch.business;

public class ConditionRule{

	private String[] conditions = new String[]{"A","A-","B+","B","B-","C+","C"};
	public double getPoints(String condition) {
		int points = 0;
		
		for (int i = 0; i < conditions.length; i++) {
			if(conditions[i].equalsIgnoreCase(condition)){
				return 1.0-i*0.07;
			}
		}
		
		return points;
	}

}
