package com.hkjc.racingtouch.business;

public class DrawRule{

	public double getPoints(String draw) {
		int points = 0;
		try{
			return 1.0-Integer.parseInt( draw )*0.04;
		}catch(Exception e){
			e.printStackTrace();;
		}
		return points;
	}

}
