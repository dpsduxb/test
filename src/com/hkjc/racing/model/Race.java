package com.hkjc.racing.model;

import java.sql.Time;
import java.util.Date;

public class Race {

	private Date RaceDate;
	
	private int RaceNo;
	
	private String Location;
	
	private int HorsePlace;
	
	private int HorseNo;
	
	private String Horse;
	
	private String Jockey;
	
	private String Trainer;
	
	private int ActualWeight;
	
	private int DeclaredWeight;
	
	private int Draw;
	
	private String LBW;
	
	private String RunningPosition;
	
	private Time FinishTime;
	
	private Float WinOdds;

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

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public int getHorsePlace() {
		return HorsePlace;
	}

	public void setHorsePlace(int horsePlace) {
		HorsePlace = horsePlace;
	}

	public int getHorseNo() {
		return HorseNo;
	}

	public void setHorseNo(int horseNo) {
		HorseNo = horseNo;
	}

	public String getHorse() {
		return Horse;
	}

	public void setHorse(String horse) {
		Horse = horse;
	}

	public String getJockey() {
		return Jockey;
	}

	public void setJockey(String jockey) {
		Jockey = jockey;
	}

	public String getTrainer() {
		return Trainer;
	}

	public void setTrainer(String trainer) {
		Trainer = trainer;
	}

	public int getActualWeight() {
		return ActualWeight;
	}

	public void setActualWeight(int actualWeight) {
		ActualWeight = actualWeight;
	}

	public int getDeclaredWeight() {
		return DeclaredWeight;
	}

	public void setDeclaredWeight(int declaredWeight) {
		DeclaredWeight = declaredWeight;
	}

	public int getDraw() {
		return Draw;
	}

	public void setDraw(int draw) {
		Draw = draw;
	}

	public String getLBW() {
		return LBW;
	}

	public void setLBW(String lBW) {
		LBW = lBW;
	}

	public String getRunningPosition() {
		return RunningPosition;
	}

	public void setRunningPosition(String runningPosition) {
		RunningPosition = runningPosition;
	}

	public Time getFinishTime() {
		return FinishTime;
	}

	public void setFinishTime(Time finishTime) {
		FinishTime = finishTime;
	}

	public Float getWinOdds() {
		return WinOdds;
	}

	public void setWinOdds(Float winOdds) {
		WinOdds = winOdds;
	}
	
}
