package com.hkjc.racingtouch.model;

import com.hkjc.racingtouch.manager.LanguageManager;
import com.hkjc.racingtouch.utils.HKJCHelper;
import java.util.ArrayList;
import java.util.List;

public class Record {
    private String bodyWeight;
    private String classesC;
    private String classesE;
    private String courseC;
    private String courseE;
    private String date;
    private String distance;
    private String draw;
    private String fastestFinalSectionalTime;
    private String finalSectionalTime;
    private String finishTime;
    private String goingC;
    private String goingCode;
    private String goingE;
    private String horseWeight;
    private String jockeyC;
    private String jockeyCode;
    private String jockeyE;
    private String lastRunVideo;
    private String margins;
    private String marginsC;
    private String marginsE;
    private String placing;
    private String previousOdds;
    private String rating;
    private String runningPosition;
    private String season;
    private String trackC;
    private String trackE;
    private String trainer;
    private String trainerC;
    private String trainerCode;
    private String trainerE;
    private String venue;
    private String venueC;
    private String venueE;
    private String weightCarried;
    private List<Winner> winners;

    public String getTrainerCode() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.trainerCode);
    }

    public void setTrainerCode(String str) {
        this.trainerCode = str;
    }

    public String getTrainer() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.trainer);
    }

    public void setTrainer(String str) {
        this.trainer = str;
    }

    public String getPlacing() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.placing);
    }

    public void setPlacing(String str) {
        this.placing = str;
    }

    public String getGoingCode() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.goingCode);
    }

    public void setGoingCode(String str) {
        this.goingCode = str;
    }

    public String getFastestFinalSectionalTime() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.fastestFinalSectionalTime);
    }

    public void setFastestFinalSectionalTime(String str) {
        this.fastestFinalSectionalTime = str;
    }

    public String getHorseWeight() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.horseWeight);
    }

    public void setHorseWeight(String str) {
        this.horseWeight = str;
    }

    public String getVenue() {
        if (LanguageManager.isChinese()) {
            return this.venueC;
        }
        return this.venueE;
    }

    public void setVenue(String str) {
        this.venue = str;
    }

    public String getFinishTime() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.finishTime);
    }

    public void setFinishTime(String str) {
        this.finishTime = str;
    }

    public String getDate() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.date);
    }

    public void setDate(String str) {
        this.date = str;
    }

    public String getWeightCarried() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.weightCarried);
    }

    public void setWeightCarried(String str) {
        this.weightCarried = str;
    }

    public String getMarginsC() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.marginsC);
    }

    public void setMarginsC(String str) {
        this.marginsC = str;
    }

    public String getFinalSectionalTime() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.finalSectionalTime);
    }

    public void setFinalSectionalTime(String str) {
        this.finalSectionalTime = str;
    }

    public String getDraw() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.draw);
    }

    public void setDraw(String str) {
        this.draw = str;
    }

    private String getCourseE() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.courseE);
    }

    public void setCourseE(String str) {
        this.courseE = str;
    }

    private String getCourseC() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.courseC);
    }

    public void setCourseC(String str) {
        this.courseC = str;
    }

    private String getGoingE() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.goingE);
    }

    public void setGoingE(String str) {
        this.goingE = str;
    }

    private String getGoingC() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.goingC);
    }

    public void setGoingC(String str) {
        this.goingC = str;
    }

    public String getDistance() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.distance);
    }

    public void setDistance(String str) {
        this.distance = str;
    }

    public String getMarginsE() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.marginsE);
    }

    public void setMarginsE(String str) {
        this.marginsE = str;
    }

    private String getClassesE() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.classesE);
    }

    public void setClassesE(String str) {
        this.classesE = str;
    }

    public String getClassesC() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.classesC);
    }

    public void setClassesC(String str) {
        this.classesC = str;
    }

    public String getMargins() {
        if (LanguageManager.isChinese()) {
            return HKJCHelper.emptyIfEqualsFlag(null, this.marginsC);
        }
        return HKJCHelper.emptyIfEqualsFlag(null, this.marginsE);
    }

    public void setMargins(String str) {
        this.margins = str;
    }

    public String getRunningPosition() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.runningPosition);
    }

    public void setRunningPosition(String str) {
        this.runningPosition = str;
    }

    public String getRating() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.rating);
    }

    public void setRating(String str) {
        this.rating = str;
    }

    public String getJockeyCode() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.jockeyCode);
    }

    public void setJockeyCode(String str) {
        this.jockeyCode = str;
    }

    public String getPreviousOdds() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.previousOdds);
    }

    public void setPreviousOdds(String str) {
        this.previousOdds = str;
    }

    public List<Winner> getWinners() {
        return this.winners;
    }

    public void setWinners(List<Winner> list) {
        this.winners = list;
    }

    public void addWinner(Winner winner) {
        if (this.winners == null) {
            this.winners = new ArrayList();
        }
        this.winners.add(winner);
    }

    public String getGoing() {
        return HKJCHelper.getStringByLanguage(this.goingC, this.goingE);
    }

    public String getCourse() {
        return HKJCHelper.getStringByLanguage(this.courseC, this.courseE);
    }

    public String getClasses() {
        return HKJCHelper.getStringByLanguage(this.classesC, this.classesE);
    }

    public String getBodyWeight() {
        return this.bodyWeight;
    }

    public void setBodyWeight(String str) {
        this.bodyWeight = str;
    }

    public String getSeason() {
        return this.season;
    }

    public void setSeason(String str) {
        this.season = str;
    }

    public String getTrainerE() {
        return this.trainerE;
    }

    public void setTrainerE(String str) {
        this.trainerE = str;
    }

    public String getTrainerC() {
        return this.trainerC;
    }

    public void setTrainerC(String str) {
        this.trainerC = str;
    }

    public String getJockeyE() {
        return this.jockeyE;
    }

    public void setJockeyE(String str) {
        this.jockeyE = str;
    }

    public String getJockeyC() {
        return this.jockeyC;
    }

    public void setJockeyC(String str) {
        this.jockeyC = str;
    }

    public String getVenueE() {
        return this.venueE;
    }

    public void setVenueE(String str) {
        this.venueE = str;
    }

    public String getVenueC() {
        return this.venueC;
    }

    public void setVenueC(String str) {
        this.venueC = str;
    }

    public String getTrack() {
        return HKJCHelper.getStringByLanguage(this.trackC, this.trackE);
    }

    public String getTrackE() {
        return this.trackE;
    }

    public void setTrackE(String str) {
        this.trackE = str;
    }

    public String getTrackC() {
        return this.trackC;
    }

    public void setTrackC(String str) {
        this.trackC = str;
    }

    public String getLastRunVideo() {
        return this.lastRunVideo;
    }

    public void setLastRunVideo(String str) {
        this.lastRunVideo = str;
    }
}
