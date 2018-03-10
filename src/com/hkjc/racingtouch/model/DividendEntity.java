package com.hkjc.racingtouch.model;

public class DividendEntity {

	public DividendEntity() {
		super();
	}
	
public DividendEntity( String MeetinDate, String PoolText, String WinCombination, String DividendAmount, String id, String MeetingVenue, String RaceNo ) {
	super();
		this.MeetinDate = MeetinDate;
		this.PoolText = PoolText;
		this.WinCombination = WinCombination;
		this.DividendAmount = DividendAmount;
		this.id = id;
		this.MeetingVenue = MeetingVenue;
		this.RaceNo = RaceNo;
	}
	
	private String MeetinDate;
	private String PoolText;
	private String WinCombination;
	private String DividendAmount;
	private String id;
	private String MeetingVenue;
	private String RaceNo;

	public void setMeetinDate (String MeetinDate){
		this.MeetinDate = MeetinDate;
	}
	
	public String getMeetinDate () {
		return this.MeetinDate;
	}
	public void setPoolText (String PoolText){
		this.PoolText = PoolText;
	}
	
	public String getPoolText () {
		return this.PoolText;
	}
	public void setWinCombination (String WinCombination){
		this.WinCombination = WinCombination;
	}
	
	public String getWinCombination () {
		return this.WinCombination;
	}
	public void setDividendAmount (String DividendAmount){
		this.DividendAmount = DividendAmount;
	}
	
	public String getDividendAmount () {
		return this.DividendAmount;
	}
	public void setid (String id){
		this.id = id;
	}
	
	public String getid () {
		return this.id;
	}
	public void setMeetingVenue (String MeetingVenue){
		this.MeetingVenue = MeetingVenue;
	}
	
	public String getMeetingVenue () {
		return this.MeetingVenue;
	}
	public void setRaceNo (String RaceNo){
		this.RaceNo = RaceNo;
	}
	
	public String getRaceNo () {
		return this.RaceNo;
	}
	
}
