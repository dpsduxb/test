package com.hkjc.racingtouch.model;

public class Dividend {
    private String meetingDate;
    private String meetingVenue;
    private int raceNo;
    private String poolText;
    private String winCombination;
    private Float dividendAmount;
    
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
	
	public int getRaceNo() {
		return raceNo;
	}
	public void setRaceNo(int raceNo) {
		this.raceNo = raceNo;
	}
	public String getPoolText() {
		return poolText;
	}
	public void setPoolText(String poolText) {
		this.poolText = poolText;
	}
	public String getWinCombination() {
		return winCombination;
	}
	public void setWinCombination(String winCombination) {
		this.winCombination = winCombination;
	}
	public Float getDividendAmount() {
		return dividendAmount;
	}
	public void setDividendAmount(Float dividendAmount) {
		this.dividendAmount = dividendAmount;
	}
	
}
