package com.hkjc.racingtouch.model;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private int distance;
    private int raceNo;
    private int raceSimDataReady;
    private List<Starter> starters;

    public int getRaceSimDataReady() {
        return this.raceSimDataReady;
    }

    public void setRaceSimDataReady(int i) {
        this.raceSimDataReady = i;
    }

    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int i) {
        this.distance = i;
    }

    public int getRaceNo() {
        return this.raceNo;
    }

    public void setRaceNo(int i) {
        this.raceNo = i;
    }

    public List<Starter> getStarters() {
        return this.starters;
    }

    public void setStarters(List<Starter> list) {
        this.starters = list;
    }

    public void addStarter(Starter starter) {
        if (this.starters == null) {
            this.starters = new ArrayList();
        }
        this.starters.add(starter);
    }
}
