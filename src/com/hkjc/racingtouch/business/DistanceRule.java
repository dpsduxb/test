package com.hkjc.racingtouch.business;

public class DistanceRule{

	public double getPoints(String distance, String idealDistance) {
		double points = 0.5;
		String[] idealDistanceRange = idealDistance.split("-");
		
		int idealDistanceStart = Integer.parseInt(idealDistanceRange[0]); 
		int idealDistanceEnd = Integer.parseInt(idealDistanceRange[1]); 
		int distanceInt = Integer.parseInt(distance); 
		
		if(distanceInt >= idealDistanceStart && distanceInt <= idealDistanceEnd){
			return 1;
		}
		
		return points;
	}

}
