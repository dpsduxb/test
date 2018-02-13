package com.hkjc.racingtouch.model;

import com.hkjc.racingtouch.utils.BooleanUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Starter implements Serializable, Cloneable {
    private static final long serialVersionUID = -1344798298866756620L;
    private String enabled;
    private String number;
    private OddsInfo plaOdds;
    private int raceNo;
    private String reserve;
    private String scratched;
    private List<Horse> starterHorse;
    private List<Runner> starterRunners;
    private OddsInfo winOdds;

    public boolean isEnabled() {
        return BooleanUtils.valueOf(this.enabled);
    }

    public int getEnabled() {
        if (this.enabled == null || this.enabled.equals("")) {
            return 0;
        }
        return Integer.valueOf(this.enabled).intValue();
    }

    public void setEnabled(String str) {
        this.enabled = str;
    }

    public int getNumber() {
        if (this.number == null || this.number.equals("")) {
            return 0;
        }
        return Integer.valueOf(this.number).intValue();
    }

    public void setNumber(String str) {
        this.number = str;
    }

    public int getScratched() {
        if (this.scratched == null || this.scratched.equals("")) {
            return 0;
        }
        return Integer.valueOf(this.scratched).intValue();
    }

    public void setScratched(String str) {
        this.scratched = str;
    }

    public int getReserve() {
        if (this.reserve == null || this.reserve.equals("")) {
            return 0;
        }
        return Integer.valueOf(this.reserve).intValue();
    }

    public void setReserve(String str) {
        this.reserve = str;
    }

    public List<Runner> getStarterRunners() {
        return this.starterRunners;
    }

    public void setStarterRunners(List<Runner> list) {
        this.starterRunners = list;
    }

    public void addStarterRunner(Runner runner) {
        if (this.starterRunners == null) {
            this.starterRunners = new ArrayList();
        }
        this.starterRunners.add(runner);
    }

    public Runner getFirstRunner() {
        if (this.starterRunners == null || this.starterRunners.size() <= 0) {
            return null;
        }
        return (Runner) this.starterRunners.get(0);
    }

    public List<Horse> getStarterHorse() {
        return this.starterHorse;
    }

    public void setStarterHorse(List<Horse> list) {
        this.starterHorse = list;
    }

    public void addStarterHorse(Horse horse) {
        if (this.starterHorse == null) {
            this.starterHorse = new ArrayList();
        }
        this.starterHorse.add(horse);
    }

    public HorseInfo getDefaultHorseInfo() {
        if (this.starterRunners == null || this.starterRunners.size() <= 0) {
            return null;
        }
        return ((Runner) this.starterRunners.get(0)).getHorseInfo();
    }

    public OddsInfo getWinOdds() {
        return this.winOdds;
    }

    public void setWinOdds(OddsInfo oddsInfo) {
        this.winOdds = oddsInfo;
    }

    public OddsInfo getPlaOdds() {
        return this.plaOdds;
    }

    public void setPlaOdds(OddsInfo oddsInfo) {
        this.plaOdds = oddsInfo;
    }

    public Object clone() {
        try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
        return null;
    }

    public String toString() {
        return "Starter [enabled=" + this.enabled + ", number=" + this.number + ", winOdds=" + this.winOdds + ", placeOdds=" + this.plaOdds + "]";
    }

    public int getRaceNo() {
        return this.raceNo;
    }

    public void setRaceNo(int i) {
        this.raceNo = i;
    }
}
