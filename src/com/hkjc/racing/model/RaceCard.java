package com.hkjc.racing.model;

import java.util.Date;

public class RaceCard {

	private String raceName;
	
	private String raceTrack;
	
	private String raceCourseType;
	
	private String raceDistance;
	
	private String raceRating;
	
	private String raceClass;
	
	private String raceLoc;
	
	private Date raceDate;
	
	private int raceNo;
	
	private int horseNo;

	private String previousRuns;

	private String colour;

	private String horse;

	private String brandNo;

	private int weight;

	private String jockey;

	private int overWt;

	private int draw;

	private String trainer;

	private int rating;

	private int ratingIncDec;

	private int decHorseWeight;

	private int decHorseWeightInc;

	private String bestTime;

	private int age;

	private String wFA;

	private String sex;

	private String seasonStakes;

	private int priority;

	private String gear;

	public String getRaceName() {
		return raceName;
	}

	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}

	public String getRaceTrack() {
		return raceTrack;
	}

	public void setRaceTrack(String raceTrack) {
		this.raceTrack = raceTrack;
	}

	public String getRaceCourseType() {
		return raceCourseType;
	}

	public void setRaceCourseType(String raceCourseType) {
		this.raceCourseType = raceCourseType;
	}

	public String getRaceDistance() {
		return raceDistance;
	}

	public void setRaceDistance(String raceDistance) {
		this.raceDistance = raceDistance;
	}

	public String getRaceRating() {
		return raceRating;
	}

	public void setRaceRating(String raceRating) {
		this.raceRating = raceRating;
	}

	public String getRaceClass() {
		return raceClass;
	}

	public void setRaceClass(String raceClass) {
		this.raceClass = raceClass;
	}

	public int getHorseNo() {
		return horseNo;
	}

	public void setHorseNo(int horseNo) {
		this.horseNo = horseNo;
	}

	public String getPreviousRuns() {
		return previousRuns;
	}

	public void setPreviousRuns(String previousRuns) {
		this.previousRuns = previousRuns;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getHorse() {
		return horse;
	}

	public void setHorse(String horse) {
		this.horse = horse;
	}

	public String getBrandNo() {
		return brandNo;
	}

	public void setBrandNo(String brandNo) {
		this.brandNo = brandNo;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getJockey() {
		return jockey;
	}

	public void setJockey(String jockey) {
		this.jockey = jockey;
	}

	public int getOverWt() {
		return overWt;
	}

	public void setOverWt(int overWt) {
		this.overWt = overWt;
	}

	public int getDraw() {
		return draw;
	}

	public void setDraw(int draw) {
		this.draw = draw;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getRatingIncDec() {
		return ratingIncDec;
	}

	public void setRatingIncDec(int ratingIncDec) {
		this.ratingIncDec = ratingIncDec;
	}

	public int getDecHorseWeight() {
		return decHorseWeight;
	}

	public void setDecHorseWeight(int decHorseWeight) {
		this.decHorseWeight = decHorseWeight;
	}

	public int getDecHorseWeightInc() {
		return decHorseWeightInc;
	}

	public void setDecHorseWeightInc(int decHorseWeightInc) {
		this.decHorseWeightInc = decHorseWeightInc;
	}

	public String getBestTime() {
		return bestTime;
	}

	public void setBestTime(String bestTime) {
		this.bestTime = bestTime;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getwFA() {
		return wFA;
	}

	public void setwFA(String wFA) {
		this.wFA = wFA;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSeasonStakes() {
		return seasonStakes;
	}

	public void setSeasonStakes(String seasonStakes) {
		this.seasonStakes = seasonStakes;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public String getRaceLoc() {
		return raceLoc;
	}

	public void setRaceLoc(String raceLoc) {
		this.raceLoc = raceLoc;
	}

	public Date getRaceDate() {
		return raceDate;
	}

	public void setRaceDate(Date raceDate) {
		this.raceDate = raceDate;
	}

	public int getRaceNo() {
		return raceNo;
	}

	public void setRaceNo(int raceNo) {
		this.raceNo = raceNo;
	}

	@Override
	public String toString() {
		return String
				.format("RaceCard [raceName=%s, raceTrack=%s, raceCourseType=%s, raceDistance=%s, raceRating=%s, raceClass=%s, raceLoc=%s, raceDate=%s, raceNo=%s, horseNo=%s, previousRuns=%s, colour=%s, horse=%s, brandNo=%s, weight=%s, jockey=%s, overWt=%s, draw=%s, trainer=%s, rating=%s, ratingIncDec=%s, decHorseWeight=%s, decHorseWeightInc=%s, bestTime=%s, age=%s, wFA=%s, sex=%s, seasonStakes=%s, priority=%s, gear=%s]",
						raceName, raceTrack, raceCourseType, raceDistance,
						raceRating, raceClass, raceLoc, raceDate, raceNo,
						horseNo, previousRuns, colour, horse, brandNo, weight,
						jockey, overWt, draw, trainer, rating, ratingIncDec,
						decHorseWeight, decHorseWeightInc, bestTime, age, wFA,
						sex, seasonStakes, priority, gear);
	}

}
