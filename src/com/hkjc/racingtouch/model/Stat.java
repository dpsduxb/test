package com.hkjc.racingtouch.model;

import com.hkjc.racingtouch.utils.HKJCHelper;

public class Stat {
    private String first;
    private String second;
    private String third;
    private String totalRuns;

    public void setThird(String str) {
        this.third = str;
    }

    public String getSecond() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.second);
    }

    public void setSecond(String str) {
        this.second = str;
    }

    public String getTotalRuns() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.totalRuns);
    }

    public void setTotalRuns(String str) {
        this.totalRuns = str;
    }

    public String getFirst() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.first);
    }

    public void setFirst(String str) {
        this.first = str;
    }

    public String getThird() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.third);
    }
}
