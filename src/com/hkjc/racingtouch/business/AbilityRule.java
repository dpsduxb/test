package com.hkjc.racingtouch.business;

public class AbilityRule{

	private String[] abilities = new String[]{"A","A-","B+","B","B-","C+","C"};
	public double getPoints(String ability) {
		double points = 0;
		
		for (int i = 0; i < abilities.length; i++) {
			if(abilities[i].equalsIgnoreCase(ability)){
				return 1.0-i*0.07;
			}
		}
		
		return points;
	}

}
