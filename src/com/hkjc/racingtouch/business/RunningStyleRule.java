package com.hkjc.racingtouch.business;

public class RunningStyleRule{

	public double getPoints(String runningStyle) {
		double points = 0.0;
		try{
			return 1.0 - .03*Integer.parseInt(runningStyle);
		}catch(Exception e){
			e.printStackTrace();;
		}
		return points;
	}

}
