package com.hkjc.racing.model;

import java.util.Date;

public class CompositeOdd {

	private Date RaceDate;
	
	private int RaceNo;

	private float a1Value;

	@Override
	public String toString() {
		return "CompositeOdd [RaceDate=" + RaceDate + ", RaceNo=" + RaceNo
				+ ", a1Value=" + a1Value + ", a2Value=" + a2Value
				+ ", a3Value=" + a3Value + "]";
	}

	private float a2Value;
	
	private float a3Value;

	public Date getRaceDate() {
		return RaceDate;
	}

	public void setRaceDate(Date raceDate) {
		RaceDate = raceDate;
	}

	public int getRaceNo() {
		return RaceNo;
	}

	public void setRaceNo(int raceNo) {
		RaceNo = raceNo;
	}

	public float getA1Value() {
		return a1Value;
	}

	public void setA1Value(float a1Value) {
		this.a1Value = a1Value;
	}

	public float getA2Value() {
		return a2Value;
	}

	public void setA2Value(float a2Value) {
		this.a2Value = a2Value;
	}

	public float getA3Value() {
		return a3Value;
	}

	public void setA3Value(float a3Value) {
		this.a3Value = a3Value;
	}
	
}
