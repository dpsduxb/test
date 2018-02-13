package com.hkjc.racingtouch.model;

public class RaceResult {
    private String meetingDate;
    private String meetingVenue;
    private int raceNo;
    private int position;
    private String horseNo;
    private String horseName;
    private String jockeyName;
    
	public String getMeetingDate() {
		return meetingDate;
	}
	public void setMeetingDate(String meetingDate) {
		this.meetingDate = meetingDate;
	}
	public String getMeetingVenue() {
		return meetingVenue;
	}
	public void setMeetingVenue(String meetingVenue) {
		this.meetingVenue = meetingVenue;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getHorseNo() {
		return horseNo;
	}
	public int getRaceNo() {
		return raceNo;
	}
	public void setRaceNo(int raceNo) {
		this.raceNo = raceNo;
	}
	public void setHorseNo(String horseNo) {
		this.horseNo = horseNo;
	}
	public String getHorseName() {
		return horseName;
	}
	public void setHorseName(String horseName) {
		this.horseName = horseName;
	}
	public String getJockeyName() {
		return jockeyName;
	}
	public void setJockeyName(String jockeyName) {
		this.jockeyName = jockeyName;
	}
    
    
}
