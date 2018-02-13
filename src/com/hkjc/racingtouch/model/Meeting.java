package com.hkjc.racingtouch.model;

import com.hkjc.racingtouch.utils.HKJCHelper;
import java.util.ArrayList;
import java.util.List;

public class Meeting {
    private String date;
    private List<Race> races;
    private String venue;

    public String getVenue() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.venue);
    }

    public void setVenue(String str) {
        this.venue = str;
    }

    public String getDate() {
        return HKJCHelper.emptyIfEqualsFlag(null, this.date);
    }

    public void setDate(String str) {
        this.date = str;
    }

    public List<Race> getRaces() {
        return this.races;
    }

    public void setRaces(List<Race> list) {
        this.races = list;
    }

    public void addRace(Race race) {
        if (this.races == null) {
            this.races = new ArrayList();
        }
        this.races.add(race);
    }

    public String getMeetingID() {
        return getDate() + getVenue();
    }
}
