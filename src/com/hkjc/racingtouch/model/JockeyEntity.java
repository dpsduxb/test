package com.hkjc.racingtouch.model;

public class JockeyEntity {

	public JockeyEntity() {
		super();
	}
	
public JockeyEntity( String id, String First, String NameE, String Place, String Win, String Second, String Third, String JockeyCode, String TotalRuns, String Rank ) {
	super();
		this.id = id;
		this.First = First;
		this.NameE = NameE;
		this.Place = Place;
		this.Win = Win;
		this.Second = Second;
		this.Third = Third;
		this.JockeyCode = JockeyCode;
		this.TotalRuns = TotalRuns;
		this.Rank = Rank;
	}
	
	private String id;
	private String First;
	private String NameE;
	private String Place;
	private String Win;
	private String Second;
	private String Third;
	private String JockeyCode;
	private String TotalRuns;
	private String Rank;

	public void setid (String id){
		this.id = id;
	}
	
	public String getid () {
		return this.id;
	}
	public void setFirst (String First){
		this.First = First;
	}
	
	public String getFirst () {
		return this.First;
	}
	public void setNameE (String NameE){
		this.NameE = NameE;
	}
	
	public String getNameE () {
		return this.NameE;
	}
	public void setPlace (String Place){
		this.Place = Place;
	}
	
	public String getPlace () {
		return this.Place;
	}
	public void setWin (String Win){
		this.Win = Win;
	}
	
	public String getWin () {
		return this.Win;
	}
	public void setSecond (String Second){
		this.Second = Second;
	}
	
	public String getSecond () {
		return this.Second;
	}
	public void setThird (String Third){
		this.Third = Third;
	}
	
	public String getThird () {
		return this.Third;
	}
	public void setJockeyCode (String JockeyCode){
		this.JockeyCode = JockeyCode;
	}
	
	public String getJockeyCode () {
		return this.JockeyCode;
	}
	public void setTotalRuns (String TotalRuns){
		this.TotalRuns = TotalRuns;
	}
	
	public String getTotalRuns () {
		return this.TotalRuns;
	}
	public void setRank (String Rank){
		this.Rank = Rank;
	}
	
	public String getRank () {
		return this.Rank;
	}
	
}
