package com.hkjc.racingtouch.model;

import com.hkjc.racingtouch.manager.LanguageManager;
import com.hkjc.racingtouch.utils.HKJCHelper;

public class Runner extends Horse {
    private String age;
    private String bestTime;
    private String bodyWeight;
    private String bodyWeightDiff;
    private String debut;
    private String draw;
    private String equipments;
    private String handicapWeight;
    private String horseCode;
    private String jockey;
    private String jockeyCode;
    private String jockeyE;
    private String lastRating;
    private String lastSixRuns;
    private int likeIndex;
    private String name;
    private String priorityRun;
    private String rating;
    private String ratingDiff;
    private String ratingRange;
    private String reserve;
    private int runnerNumber;
    private String saddleNum;
    private String scratched;
    private String sex;
    private String silk;
    private String stakesWon;
    private String trainer;
    private String trainerCode;
    private String trainerE;
    private String trainerPref;
    private String trumpCard;
    private String weightAllowance;
    private String weightCarried;
    private String weightCarriedDiff;
    private String wfa;

    public String getDebut() {
        return this.debut;
    }

    public void setDebut(String str) {
        this.debut = str;
    }

    public int getRunnerNumber() {
        return this.runnerNumber;
    }

    public void setRunnerNumber(int i) {
        this.runnerNumber = i;
    }

    public String getWfa() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.wfa);
    }

    public void setWfa(String str) {
        this.wfa = str;
    }

    public boolean isScratched() {
        return "1".equals(this.scratched);
    }

    public void setScratched(String str) {
        this.scratched = str;
    }

    public String getTrainerCode() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.trainerCode);
    }

    public void setTrainerCode(String str) {
        this.trainerCode = str;
    }

    public String getAge() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.age);
    }

    public void setAge(String str) {
        this.age = str;
    }

    public String getTrainerE() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.trainerE);
    }

    public void setTrainerE(String str) {
        this.trainerE = str;
    }

    public String getTrumpCard() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.trumpCard);
    }

    public void setTrumpCard(String str) {
        this.trumpCard = str;
    }

    public String getTrainer() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.trainer);
    }

    public void setTrainer(String str) {
        this.trainer = str;
    }

    public String getLastRating() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.lastRating);
    }

    public void setLastRating(String str) {
        this.lastRating = str;
    }

    public String getBodyWeight() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.bodyWeight);
    }

    public void setBodyWeight(String str) {
        this.bodyWeight = str;
    }

    public String getHorseCode() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.horseCode);
    }

    public void setHorseCode(String str) {
        this.horseCode = str;
    }

    public String getBestTime() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.bestTime);
    }

    public void setBestTime(String str) {
        this.bestTime = str;
    }

    public String getTrainerPref() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.trainerPref);
    }

    public void setTrainerPref(String str) {
        this.trainerPref = str;
    }

    public String getWeightCarried() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.weightCarried);
    }

    public void setWeightCarried(String str) {
        this.weightCarried = str;
    }

    public String getPriorityRun() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.priorityRun);
    }

    public void setPriorityRun(String str) {
        this.priorityRun = str;
    }

    public String getJockeyE() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.jockeyE);
    }

    public void setJockeyE(String str) {
        this.jockeyE = str;
    }

    public String getDraw() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.draw);
    }

    public void setDraw(String str) {
        this.draw = str;
    }

    public String getSex() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.sex);
    }

    public void setSex(String str) {
        this.sex = str;
    }

    public boolean isReserve() {
        if (this.reserve == null) {
            return false;
        }
        return this.reserve.equals("1");
    }

    public String getReserve() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.reserve);
    }

    public void setReserve(String str) {
        this.reserve = str;
    }

    public String getWeightAllowance() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.weightAllowance);
    }

    public void setWeightAllowance(String str) {
        this.weightAllowance = str;
    }

    public String getSilk() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.silk);
    }

    public void setSilk(String str) {
        this.silk = str;
    }

    public String getEquipments() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.equipments);
    }

    public void setEquipments(String str) {
        this.equipments = str;
    }

    public String getStakesWon() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.stakesWon);
    }

    public void setStakesWon(String str) {
        this.stakesWon = str;
    }

    public String getName() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.name);
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getJockey() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.jockey);
    }

    public void setJockey(String str) {
        this.jockey = str;
    }

    public String getRating() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.rating);
    }

    public void setRating(String str) {
        this.rating = str;
    }

    public String getRatingRange() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.ratingRange);
    }

    public void setRatingRange(String str) {
        this.ratingRange = str;
    }

    public String getLastSixRuns() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.lastSixRuns);
    }

    public void setLastSixRuns(String str) {
        this.lastSixRuns = str;
    }

    public String getSaddleNum() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.saddleNum);
    }

    public void setSaddleNum(String str) {
        this.saddleNum = str;
    }

    public String getHandicapWeight() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.handicapWeight);
    }

    public void setHandicapWeight(String str) {
        this.handicapWeight = str;
    }

    public String getJockeyCode() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.jockeyCode);
    }

    public void setJockeyCode(String str) {
        this.jockeyCode = str;
    }

    public void setHorse(Horse horse) {
        setHorseCode(horse.getHorseCode());
        setHorseLifetimeStat(horse.getHorseLifetimeStat());
        setHorseLifetimeDistanceStat(horse.getHorseLifetimeDistanceStat());
        setDistanceRunsInpercent(horse.getDistanceRunsInpercent());
        setHorseRecords(horse.getHorseRecords());
        setHorseComments(horse.getHorseComments());
        setHorseElement3Ds(horse.getHorseElement3Ds());
        setTriviaE(horse.getTriviaContentE());
        setTriviaC(horse.getTriviaContentC());
        setHorseInfo(horse.getHorseInfo());
    }

    public String getTrainerName() {
        if (LanguageManager.isChinese()) {
            return HKJCHelper.emptyIfEqualsFlag(null, this.trainer);
        }
        return HKJCHelper.emptyIfEqualsFlag(null, this.trainerE);
    }

    public String getJockeyName() {
        if (LanguageManager.isChinese()) {
            return HKJCHelper.emptyIfEqualsFlag(null, this.jockey);
        }
        return HKJCHelper.emptyIfEqualsFlag(null, this.jockeyE);
    }

    public String getRatingDiff() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.ratingDiff);
    }

    public void setRatingDiff(String str) {
        this.ratingDiff = str;
    }

    public String getBodyWeightDiff() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.bodyWeightDiff);
    }

    public void setBodyWeightDiff(String str) {
        this.bodyWeightDiff = str;
    }

    public String getWeightCarriedDiff() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.weightCarriedDiff);
    }

    public void setWeightCarriedDiff(String str) {
        this.weightCarriedDiff = str;
    }

    public int getLikeIndex() {
        return this.likeIndex;
    }

    public void setLikeIndex(int i) {
        this.likeIndex = i;
    }
}
