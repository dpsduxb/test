package com.hkjc.racingtouch.business;

import java.util.List;

public class Rules {

	public double formRule(List<Integer> lastSix){
		return new FormRule().getPoints(lastSix);
	}
	
	public double distanceRule(String distance, String idealDistance){
		return new DistanceRule().getPoints(distance, idealDistance);
	}
	
	public double drawRule(String draw){
		return new DrawRule().getPoints(draw);
	}
	
	public double AbilityRule(String ability){
		return new AbilityRule().getPoints(ability);
	}
	
	public double CoditionRule(String condition){
		return new ConditionRule().getPoints(condition);
	}
	
	public double RunningStyleRule(String runningStyle){
		return new RunningStyleRule().getPoints(runningStyle);
	}
	
	public double RankRule(String rank){
		return new RankRule().getPoints(rank);
	}
}
