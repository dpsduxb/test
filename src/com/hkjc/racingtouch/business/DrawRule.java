package com.hkjc.racingtouch.business;

public class DrawRule{

	public double getPoints(String draw) {
		int points = 0;
		try{
			return 1.0/(5*Integer.parseInt( draw ));
		}catch(Exception e){
			e.printStackTrace();;
		}
		return points;
	}

}
