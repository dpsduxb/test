package com.hkjc.racingtouch.model;

public class ResultEntity {

	public ResultEntity() {
		super();
	}
	
public ResultEntity( String HorseNo, String Position, String JockeyName, String id, String RaceNo, String MeetingDate, String MeetingVenue, String HorseName ) {
	super();
		this.HorseNo = HorseNo;
		this.Position = Position;
		this.JockeyName = JockeyName;
		this.id = id;
		this.RaceNo = RaceNo;
		this.MeetingDate = MeetingDate;
		this.MeetingVenue = MeetingVenue;
		this.HorseName = HorseName;
	}
	
	private String HorseNo;
	private String Position;
	private String JockeyName;
	private String id;
	private String RaceNo;
	private String MeetingDate;
	private String MeetingVenue;
	private String HorseName;

	public void setHorseNo (String HorseNo){
		this.HorseNo = HorseNo;
	}
	
	public String getHorseNo () {
		return this.HorseNo;
	}
	public void setPosition (String Position){
		this.Position = Position;
	}
	
	public String getPosition () {
		return this.Position;
	}
	public void setJockeyName (String JockeyName){
		this.JockeyName = JockeyName;
	}
	
	public String getJockeyName () {
		return this.JockeyName;
	}
	public void setid (String id){
		this.id = id;
	}
	
	public String getid () {
		return this.id;
	}
	public void setRaceNo (String RaceNo){
		this.RaceNo = RaceNo;
	}
	
	public String getRaceNo () {
		return this.RaceNo;
	}
	public void setMeetingDate (String MeetingDate){
		this.MeetingDate = MeetingDate;
	}
	
	public String getMeetingDate () {
		return this.MeetingDate;
	}
	public void setMeetingVenue (String MeetingVenue){
		this.MeetingVenue = MeetingVenue;
	}
	
	public String getMeetingVenue () {
		return this.MeetingVenue;
	}
	public void setHorseName (String HorseName){
		this.HorseName = HorseName;
	}
	
	public String getHorseName () {
		return this.HorseName;
	}
	
}
