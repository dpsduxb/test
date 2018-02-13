package com.hkjc.racingtouch.model;

import java.net.URI;

import com.hkjc.racingtouch.constants.HorseRunningStyle;
import com.hkjc.racingtouch.manager.LanguageManager;
import com.hkjc.racingtouch.utils.HKJCHelper;

public class HorseInfo {
    private String ability;
    private int abilityNum;
    private String age;
    private String bodyWeight;
    private String classChangeC;
    private String classChangeE;
    private String condition;
    private int conditionNum;
    private String countryCode;
    private String damC;
    private String damE;
    private String debut;
    private String draw;
    private String eternal;
    private int horseWeight;
    private String idealDistance;
    private String jockeyCode;
    private String jockeyRank;
    private int lastHorseWeight;
    private int lastRunVideo;
    private String lastSixRecords;
    private URI mHorseImagePath;
    private int mLikeIndex;
    private String ownerC;
    private String ownerE;
    private String runningStyleAll;
    private String sireC;
    private String sireE;
    private String stableChangeC;
    private String stableChangeE;
    private String trainerCode;
    private String trainerRank;
    private String weightCarried;

    public String getDebut() {
        return this.debut;
    }

    public void setDebut(String str) {
        this.debut = str;
    }

    public String getClassChange() {
        if (LanguageManager.isChinese()) {
            return this.classChangeC;
        }
        return this.classChangeE;
    }

    public void setClassChangeE(String str) {
        this.classChangeE = str;
    }

    public void setClassChangeC(String str) {
        this.classChangeC = str;
    }

    public String getStableChange() {
        if (LanguageManager.isChinese()) {
            return this.stableChangeC;
        }
        return this.stableChangeE;
    }

    public void setStableChangeE(String str) {
        this.stableChangeE = str;
    }

    public void setStableChangeC(String str) {
        this.stableChangeC = str;
    }

    public String getSire() {
        if (LanguageManager.isChinese()) {
            return this.sireC;
        }
        return this.sireE;
    }

    public void setSireC(String str) {
        this.sireC = str;
    }

    public void setSireE(String str) {
        this.sireE = str;
    }

    public String getDam() {
        if (LanguageManager.isChinese()) {
            return this.damC;
        }
        return this.damE;
    }

    public void setDamE(String str) {
        this.damE = str;
    }

    public void setDamC(String str) {
        this.damC = str;
    }

    public int getmLikeIndex() {
        return this.mLikeIndex;
    }

    public void setmLikeIndex(int i) {
        this.mLikeIndex = i;
    }

    public URI getmHorseImagePath() {
        return this.mHorseImagePath;
    }

    public void setmHorseImagePath(URI uri) {
        this.mHorseImagePath = uri;
    }

    public String getCondition() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.condition);
    }

    public void setCondition(String str) {
        this.condition = str;
    }

    public String getEternal() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.eternal);
    }

    public void setEternal(String str) {
        this.eternal = str;
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

    public int getConditionNum() {
        return this.conditionNum;
    }

    public void setConditionNum(int i) {
        this.conditionNum = i;
    }

    public String getRunningStyleAll() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.runningStyleAll);
    }

    public void setRunningStyleAll(String str) {
        this.runningStyleAll = str;
    }

    public HorseRunningStyle getHorseRunningStyle() {
        return HorseRunningStyle.get(this.runningStyleAll);
    }

    public String getIdealDistance() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.idealDistance);
    }

    public void setIdealDistance(String str) {
        this.idealDistance = str;
    }

    public int getAbilityNum() {
        return this.abilityNum;
    }

    public void setAbilityNum(int i) {
        this.abilityNum = i;
    }

    public int getHorseWeight() {
        return this.horseWeight;
    }

    public void setHorseWeight(int i) {
        this.horseWeight = i;
    }

    public int getLastHorseWeight() {
        return this.lastHorseWeight;
    }

    public void setLastHorseWeight(int i) {
        this.lastHorseWeight = i;
    }

    public String getWeightCarried() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.weightCarried);
    }

    public void setWeightCarried(String str) {
        this.weightCarried = str;
    }

    public String getLastSixRecords() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.lastSixRecords);
    }

    public void setLastSixRecords(String str) {
        this.lastSixRecords = str;
    }

    public String getAbility() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.ability);
    }

    public void setAbility(String str) {
        this.ability = str;
    }

    public String getCountryCode() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.countryCode);
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public String getJockeyCode() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.jockeyCode);
    }

    public void setJockeyCode(String str) {
        this.jockeyCode = str;
    }

    private String getOwnerE() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.ownerE);
    }

    public void setOwnerE(String str) {
        this.ownerE = str;
    }

    public String getDraw() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.draw);
    }

    public void setDraw(String str) {
        this.draw = str;
    }

    private String getOwnerC() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.ownerC);
    }

    public void setOwnerC(String str) {
        this.ownerC = str;
    }

    public String getOwner() {
        return HKJCHelper.getStringByLanguage(this.ownerC, this.ownerE);
    }

    public int getLastRunVideo() {
        return this.lastRunVideo;
    }

    public void setLastRunVideo(int i) {
        this.lastRunVideo = i;
    }

    public String getJockeyRank() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.jockeyRank);
    }

    public void setJockeyRank(String str) {
        this.jockeyRank = str;
    }

    public String getTrainerRank() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.trainerRank);
    }

    public void setTrainerRank(String str) {
        this.trainerRank = str;
    }

    public String getBodyWeight() {
        return this.bodyWeight;
    }

    public void setBodyWeight(String str) {
        this.bodyWeight = str;
    }
}
