package com.hkjc.racingtouch.model;

import com.hkjc.racingtouch.manager.*;
import com.hkjc.racingtouch.utils.HKJCHelper;
import java.util.ArrayList;
import java.util.List;

public class Horse {
    private double distanceRunsInpercent;
    private String horseCode;
    private List<Comment> horseComments;
    private List<Element3D> horseElement3Ds;
    private HorseInfo horseInfo;
    private DistanceStat horseLifetimeDistanceStat;
    private Stat horseLifetimeStat;
    private int horseNumber;
    private List<Record> horseRecords;
    private String jockeyNameC;
    private String jockeyNameE;
    private String nameC;
    private String nameE;
    private String trainerNameC;
    private String trainerNameE;
    private TriviaContent triviaContentC;
    private TriviaContent triviaContentE;

    public String getTrainerNameE() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.trainerNameE);
    }

    public String getTrivia() {
        if (LanguageManager.isChinese()) {
            if (this.triviaContentC != null) {
                return this.triviaContentC.getTxt();
            }
        } else if (this.triviaContentE != null) {
            return this.triviaContentE.getTxt();
        }
        return null;
    }

    public void setTriviaC(TriviaContent triviaContent) {
        this.triviaContentC = triviaContent;
    }

    public void setTriviaE(TriviaContent triviaContent) {
        this.triviaContentE = triviaContent;
    }

    public TriviaContent getTriviaContentE() {
        return this.triviaContentE;
    }

    public TriviaContent getTriviaContentC() {
        return this.triviaContentC;
    }

    public void setTrainerNameE(String str) {
        this.trainerNameE = str;
    }

    public String getNameC() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.nameC);
    }

    public void setNameC(String str) {
        this.nameC = str;
    }

    public String getHorseName() {
        return HKJCHelper.getStringByLanguage(this.nameC, this.nameE);
    }

    public String getNameE() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.nameE);
    }

    public void setNameE(String str) {
        this.nameE = str;
    }

    public String getTrainerNameC() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.trainerNameC);
    }

    public void setTrainerNameC(String str) {
        this.trainerNameC = str;
    }

    public String getJockeyNameC() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.jockeyNameC);
    }

    public void setJockeyNameC(String str) {
        this.jockeyNameC = str;
    }

    public String getJockeyNameE() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.jockeyNameE);
    }

    public void setJockeyNameE(String str) {
        this.jockeyNameE = str;
    }

    public int getHorseNumber() {
        return this.horseNumber;
    }

    public void setHorseNumber(int i) {
        this.horseNumber = i;
    }

    public String getHorseCode() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.horseCode);
    }

    public void setHorseCode(String str) {
        this.horseCode = str;
    }

    public Stat getHorseLifetimeStat() {
        return this.horseLifetimeStat;
    }

    public void setHorseLifetimeStat(Stat stat) {
        this.horseLifetimeStat = stat;
    }

    public DistanceStat getHorseLifetimeDistanceStat() {
        return this.horseLifetimeDistanceStat;
    }

    public void setHorseLifetimeDistanceStat(DistanceStat distanceStat) {
        this.horseLifetimeDistanceStat = distanceStat;
        if (distanceStat != null) {
            setDistanceRunsInpercent(cucualateDistanceRuns(this.horseLifetimeDistanceStat));
        }
    }

    private double cucualateDistanceRuns(DistanceStat distanceStat) {
        double d;
        Object first = distanceStat.getFirst();
        if (first.toString().isEmpty()) {
            d = 0.0d;
        } else {
            d = Double.parseDouble(first.toString()) + 0.0d;
        }
        Object second = distanceStat.getSecond();
        if (!second.toString().isEmpty()) {
            d += Double.parseDouble(second.toString());
        }
        second = distanceStat.getThird();
        if (!second.toString().isEmpty()) {
            d += Double.parseDouble(second.toString());
        }
        String totalRuns = distanceStat.getTotalRuns();
        if (!totalRuns.isEmpty() || totalRuns.equals("0")) {
            return 0.0d;
        }
        return d / Double.parseDouble(totalRuns);
    }

    public List<Record> getHorseRecords() {
        return this.horseRecords;
    }

    public void setHorseRecords(List<Record> list) {
        this.horseRecords = list;
    }

    public void addHorseRecord(Record record) {
        if (this.horseRecords == null) {
            this.horseRecords = new ArrayList();
        }
        this.horseRecords.add(record);
    }

    public List<Comment> getHorseComments() {
        return this.horseComments;
    }

    public void setHorseComments(List<Comment> list) {
        this.horseComments = list;
    }

    public void addHorseComment(Comment comment) {
        if (this.horseComments == null) {
            this.horseComments = new ArrayList();
        }
        this.horseComments.add(comment);
    }

    public List<Element3D> getHorseElement3Ds() {
        return this.horseElement3Ds;
    }

    public void setHorseElement3Ds(List<Element3D> list) {
        this.horseElement3Ds = list;
    }

    public void addHorseElement3D(Element3D element3D) {
        if (this.horseElement3Ds == null) {
            this.horseElement3Ds = new ArrayList();
        }
        this.horseElement3Ds.add(element3D);
    }

    public HorseInfo getHorseInfo() {
        return this.horseInfo;
    }

    public void setHorseInfo(HorseInfo horseInfo) {
        this.horseInfo = horseInfo;
    }

    public Comment getCommentByType(String str) {
        if (this.horseComments != null && this.horseComments.size() > 0) {
            for (int i = 0; i < this.horseComments.size(); i++) {
                Comment comment = (Comment) this.horseComments.get(i);
                if (LanguageManager.isChinese()) {
                    if (comment.getLang().equals("zh-hk") && comment.getType().equals(str)) {
                        return comment;
                    }
                } else if (comment.getLang().equals("en-us") && comment.getType().equals(str)) {
                    return comment;
                }
            }
        }
        return null;
    }

    public double getDistanceRunsInpercent() {
        return this.distanceRunsInpercent;
    }

    public void setDistanceRunsInpercent(double d) {
        this.distanceRunsInpercent = d;
    }
}
