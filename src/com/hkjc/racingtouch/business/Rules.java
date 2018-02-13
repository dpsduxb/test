package com.hkjc.racingtouch.business;

import java.util.List;

public class Rules {

	public boolean formRule(List<Integer> lastSix){
		return new FormRule().getPoints(lastSix);
	}
	
	public boolean distanceRule(String distance){
		return false;
	}
	
	public boolean drawRule(String draw){
		return false;
	}
	
	public boolean AbilityRule(String ability){
		return false;
	}
}
