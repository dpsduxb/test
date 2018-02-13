package com.hkjc.racingtouch.manager;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.hkjc.racingtouch.model.Comment;
import com.hkjc.racingtouch.model.DistanceStat;
import com.hkjc.racingtouch.model.Element3D;
import com.hkjc.racingtouch.model.Horse;
import com.hkjc.racingtouch.model.HorseInfo;
import com.hkjc.racingtouch.model.HrProfileHorse;
import com.hkjc.racingtouch.model.Meeting;
import com.hkjc.racingtouch.model.Race;
import com.hkjc.racingtouch.model.Record;
import com.hkjc.racingtouch.model.Starter;
import com.hkjc.racingtouch.model.Stat;
import com.hkjc.racingtouch.model.TriviaContent;
import com.hkjc.racingtouch.model.Winner;

public class RaceXMLParser {

	public DistanceStat mDistanceStat = null;
	public Stat mStat = null;
	public Winner mWinner = null;
	public Record mRecord = null;
	public Element3D mElement3D = null;
	public Comment mComment = null;
	public TriviaContent triviaContent = null;
	public HorseInfo mHorseInfo = null;
	public Horse mHorse = null;
	public Starter mStarter = null;
	public Race mRace = null;
	public Meeting mMeeting = null;
	public HrProfileHorse mHrProfileHorse = null;

	public boolean parseRaceMeetingXML(Element race){
		this.parseMeeting(race.select("Meeting").first());
		
		return true;
	}

	public boolean parseRaceXML(Element race){
		this.parseRace(race.select("Race").first());
		
		return true;
	}
	public boolean parseRaceStarterXML(Element race){
		this.parseComment(race.select("comments"));
		this.parseDistanceStat(race.select("LifetimeDistanceStat").first());
		//this.parseElement3D(race);
		this.parseHorse(race.select("Horse").first());
		this.parseHorseInfo(race.select("HorseInfo").first());
		//this.parseMeeting(race.select("Meeting").first());
		//this.parseRace(race.select("Race").first());
		//this.parseRecord(race.select("LifetimeDistanceStat").first());
		this.parseStarter(race.select("Starter").first());
		this.parseStat(race.select("LifetimeStat").first());
		//this.parseTriviaContent(race.select("LifetimeDistanceStat").first());
		//this.parseWinner(race.select("LifetimeDistanceStat").first());
		//this.parseXMLRoot(race.select("LifetimeDistanceStat").first());
		
		return true;
	}
	private boolean parseDistanceStat(Element xmlPullParser) {
        this.mDistanceStat = new DistanceStat();
        this.mDistanceStat.setThird(xmlPullParser.attr("Third"));
        this.mDistanceStat.setSecond(xmlPullParser.attr("Second"));
        this.mDistanceStat.setFirst(xmlPullParser.attr("First"));
        this.mDistanceStat.setTotalRuns(xmlPullParser.attr("TotalRuns"));
        return true;
    }

    private boolean parseStat(Element xmlPullParser) {
        this.mStat = new Stat();
        this.mStat.setThird(xmlPullParser.attr("Third"));
        this.mStat.setSecond(xmlPullParser.attr("Second"));
        this.mStat.setFirst(xmlPullParser.attr("First"));
        this.mStat.setTotalRuns(xmlPullParser.attr("TotalRuns"));
        return true;
    }

    private boolean parseWinner(Element xmlPullParser) {
        
    	this.mWinner = new Winner();
        this.mWinner.setNameC(xmlPullParser.attr("NameC"));
        this.mWinner.setNameE(xmlPullParser.attr("NameE"));
        this.mWinner.setFinalSectionalTime(xmlPullParser.attr("FinalSectionalTime"));
        this.mWinner.setFinishTime(xmlPullParser.attr("FinishTime"));
        this.mWinner.setPlacing(getIntFromParer(xmlPullParser, "Placing", 0));
        return true;
    }

    private boolean parseRecord(Element xmlPullParser) {
        
    	this.mRecord = new Record();
        this.mRecord.setVenue(xmlPullParser.attr("Venue"));
        this.mRecord.setDate(xmlPullParser.attr("Date"));
        this.mRecord.setDistance(xmlPullParser.attr("Distance"));
        this.mRecord.setLastRunVideo(xmlPullParser.attr("LastRunVideo"));
        this.mRecord.setWeightCarried(xmlPullParser.attr("WeightCarried"));
        this.mRecord.setTrainerCode(xmlPullParser.attr("TrainerCode"));
        this.mRecord.setJockeyCode(xmlPullParser.attr("JockeyCode"));
        this.mRecord.setBodyWeight(xmlPullParser.attr("BodyWeight"));
        this.mRecord.setHorseWeight(xmlPullParser.attr("HorseWeight"));
        this.mRecord.setDraw(xmlPullParser.attr("Draw"));
        this.mRecord.setSeason(xmlPullParser.attr("Season"));
        this.mRecord.setFastestFinalSectionalTime(xmlPullParser.attr("FastestFinalSectionalTime"));
        this.mRecord.setFinalSectionalTime(xmlPullParser.attr("FinalSectionalTime"));
        this.mRecord.setFinishTime(xmlPullParser.attr("FinishTime"));
        this.mRecord.setPreviousOdds(xmlPullParser.attr("PreviousOdds"));
        this.mRecord.setRunningPosition(xmlPullParser.attr("RunningPosition"));
        this.mRecord.setRating(xmlPullParser.attr("Rating"));
        this.mRecord.setTrainer(xmlPullParser.attr("Trainer"));
        this.mRecord.setTrainerE(xmlPullParser.attr("TrainerE"));
        this.mRecord.setTrainerC(xmlPullParser.attr("TrainerC"));
        this.mRecord.setJockeyE(xmlPullParser.attr("JockeyE"));
        this.mRecord.setJockeyC(xmlPullParser.attr("JockeyC"));
        this.mRecord.setPlacing(xmlPullParser.attr("Placing"));
        this.mRecord.setMargins(xmlPullParser.attr("Margins"));
        this.mRecord.setMarginsE(xmlPullParser.attr("MarginsE"));
        this.mRecord.setMarginsC(xmlPullParser.attr("MarginsC"));
        this.mRecord.setGoingE(xmlPullParser.attr("GoingE"));
        this.mRecord.setGoingC(xmlPullParser.attr("GoingC"));
        this.mRecord.setGoingCode(xmlPullParser.attr("GoingCode"));
        this.mRecord.setClassesE(xmlPullParser.attr("ClassesE"));
        this.mRecord.setClassesC(xmlPullParser.attr("ClassesC"));
        this.mRecord.setVenueE(xmlPullParser.attr("VenueE"));
        this.mRecord.setVenueC(xmlPullParser.attr("VenueC"));
        this.mRecord.setTrackE(xmlPullParser.attr("TrackE"));
        this.mRecord.setTrackC(xmlPullParser.attr("TrackC"));
        this.mRecord.setCourseE(xmlPullParser.attr("CourseE"));
        this.mRecord.setCourseC(xmlPullParser.attr("CourseC"));
        return true;
    }

    private boolean parseElement3D(Element xmlPullParser) {
        
    	this.mElement3D = new Element3D();
        this.mElement3D.setSeq(getIntFromParer(xmlPullParser, "Seq", 0));
        return true;
    }

    private boolean parseComment(Elements comments) {
    	for (Element comment : comments.first().children()) {
    		this.mComment = new Comment();
    		this.mComment.setLang(comment.attr("Lang"));
    		this.mComment.setType(comment.attr("Type"));
    		
    		if(comment.attr("Type").equalsIgnoreCase("long") && comment.attr("Lang").equalsIgnoreCase("en-US")){
    			this.mComment.setLongTextE(comment.text());
    			break;
    		}
    	}
        return true;
    }

    private boolean parseTriviaContent(Element xmlPullParser) {
        
    	this.triviaContent = new TriviaContent();
        this.triviaContent.setLang(xmlPullParser.attr("Lang"));
        return true;
    }

    private boolean parseHorseInfo(Element xmlPullParser) {
        
    	this.mHorseInfo = new HorseInfo();
        this.mHorseInfo.setLastRunVideo(getIntFromParer(xmlPullParser, "LastRunVideo", 0));
        this.mHorseInfo.setEternal(xmlPullParser.attr("Eternal"));
        this.mHorseInfo.setLastSixRecords(xmlPullParser.attr("LastSixRunsTxt"));
        this.mHorseInfo.setRunningStyleAll(xmlPullParser.attr("RunningStyleAll"));
        this.mHorseInfo.setIdealDistance(xmlPullParser.attr("IdealDistance"));
        this.mHorseInfo.setOwnerE(xmlPullParser.attr("OwnerE"));
        this.mHorseInfo.setOwnerC(xmlPullParser.attr("OwnerC"));
        this.mHorseInfo.setTrainerCode(xmlPullParser.attr("TrainerCode"));
        this.mHorseInfo.setJockeyCode(xmlPullParser.attr("JockeyCode"));
        this.mHorseInfo.setWeightCarried(xmlPullParser.attr("WeightCarried"));
        this.mHorseInfo.setConditionNum(getIntFromParer(xmlPullParser, "ConditionNum", 0));
        this.mHorseInfo.setAbilityNum(getIntFromParer(xmlPullParser, "AbilityNum", 0));
        this.mHorseInfo.setCondition(xmlPullParser.attr("Condition"));
        this.mHorseInfo.setAbility(xmlPullParser.attr("Ability"));
        this.mHorseInfo.setLastHorseWeight(getIntFromParer(xmlPullParser, "LastHorseWeight", 0));
        this.mHorseInfo.setAge(xmlPullParser.attr("Age"));
        this.mHorseInfo.setCountryCode(xmlPullParser.attr("CountryCode"));
        this.mHorseInfo.setDraw(xmlPullParser.attr("Draw"));
        this.mHorseInfo.setBodyWeight(xmlPullParser.attr("BodyWeight"));
        this.mHorseInfo.setHorseWeight(getIntFromParer(xmlPullParser, "HorseWeight", 0));
        this.mHorseInfo.setStableChangeC(xmlPullParser.attr("StableChangeC"));
        this.mHorseInfo.setStableChangeE(xmlPullParser.attr("StableChangeE"));
        this.mHorseInfo.setClassChangeC(xmlPullParser.attr("ClassChangeC"));
        this.mHorseInfo.setClassChangeE(xmlPullParser.attr("ClassChangeE"));
        this.mHorseInfo.setDamC(xmlPullParser.attr("DamC"));
        this.mHorseInfo.setDamE(xmlPullParser.attr("DamE"));
        this.mHorseInfo.setSireC(xmlPullParser.attr("SireC"));
        this.mHorseInfo.setSireE(xmlPullParser.attr("SireE"));
        return true;
    }

    private boolean parseHorse(Element xmlPullParser) {
        
    	this.mHorse = new Horse();
        this.mHorse.setNameC(xmlPullParser.attr("NameC"));
        this.mHorse.setNameE(xmlPullParser.attr("NameE"));
        this.mHorse.setHorseCode(xmlPullParser.attr("HorseCode"));
        return true;
    }

    private boolean parseStarter(Element xmlPullParser) {
        
    	this.mStarter = new Starter();
        this.mStarter.setEnabled(xmlPullParser.attr("Enabled"));
        this.mStarter.setNumber(xmlPullParser.attr("Number"));
        return true;
    }

    private boolean parseRace(Element xmlPullParser) {
        
    	this.mRace = new Race();
        this.mRace.setRaceSimDataReady(getIntFromParer(xmlPullParser, "RaceSimDataReady", 0));
        this.mRace.setDistance(getIntFromParer(xmlPullParser, "Distance", 0));
        this.mRace.setRaceNo(getIntFromParer(xmlPullParser, "RaceNo", 0));
        return true;
    }

    private boolean parseMeeting(Element xmlPullParser) {
        
    	this.mMeeting = new Meeting();
        this.mMeeting.setVenue(xmlPullParser.attr("Venue"));
        this.mMeeting.setDate(xmlPullParser.attr("Date"));
        return true;
    }

    private boolean parseXMLRoot(Element xmlPullParser) {
        
    	this.mHrProfileHorse = new HrProfileHorse();
        this.mHrProfileHorse.setId(getIntFromParer(xmlPullParser, "ID", 0));
        this.mHrProfileHorse.setName(xmlPullParser.attr("Name"));
        this.mHrProfileHorse.setTimestamp(xmlPullParser.attr("Timestamp"));
        this.mHrProfileHorse.setVersion(xmlPullParser.attr("Version"));
        return true;
    }
    private int getIntFromParer(Element element, String key, int defVal){
    	String attrVal = element.attr(key);
    	if(attrVal != null && !attrVal.isEmpty()){
    		return Integer.parseInt(attrVal);
    	}else{
    		return defVal;
    	}
    }
}
