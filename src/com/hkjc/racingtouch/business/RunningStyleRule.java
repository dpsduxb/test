package com.hkjc.racingtouch.business;

public class RunningStyleRule{

	public double getPoints(String runningStyle) {
		int points = 0;
		try{
			return 1.0/Integer.parseInt(runningStyle);
		}catch(Exception e){
			e.printStackTrace();;
		}
		return points;
	}

}
