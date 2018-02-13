package com.hkjc.racing.model;

public class RaceWinOdds {

	private Race race;
	
	private CompositeOdd comOdd;

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public CompositeOdd getComOdd() {
		return comOdd;
	}

	public void setComOdd(CompositeOdd comOdd) {
		this.comOdd = comOdd;
	}
	
}
