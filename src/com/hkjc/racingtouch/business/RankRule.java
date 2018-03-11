package com.hkjc.racingtouch.business;

public class RankRule{

	public double getPoints(String rank) {
		double points = 0.0;
		try{
			return 1.0/Integer.parseInt(rank);
		}catch(Exception e){
			e.printStackTrace();;
		}
		return points;
	}

}
